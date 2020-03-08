package seleniumprogram;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_demo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		String mainwindow = driver.getWindowHandle();
		
		// To handle all new open window
		 Set<String> s1 = driver.getWindowHandles();
		Iterator<String> itr1 = s1.iterator();
		
		while(itr1.hasNext())
		{
			String childwindow = itr1.next();
			
			if(!mainwindow.equalsIgnoreCase(childwindow))
			{
				//Switch to child window
				driver.switchTo().window(childwindow);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("bshad@yopmail.com");
				driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
				driver.close();
				
			}
			
		}
		
		//switch to parent window
		driver.switchTo().window(mainwindow);
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
