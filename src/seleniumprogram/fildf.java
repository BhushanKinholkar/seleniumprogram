package seleniumprogram;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fildf {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		
		/*WebElement ele = driver.findElement(By.xpath("//input[@name='files[]']"));
		Iterator iter = */
		List<WebElement> elements = (List<WebElement>) driver.findElement(By.xpath("//input[@name='files[]']"));
		for(WebElement element : elements) 
		{
		    if(!element.getText().equals("txt"))
		    {   
		       element.sendKeys("C:\\Users\\ADMIN\\Desktop\\saffornart.txt");
		    }
		}
		driver.close();
	}

}
