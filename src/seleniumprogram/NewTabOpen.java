package seleniumprogram;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabOpen 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		String selectnewtab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.linkText("Create a new account")).sendKeys(selectnewtab);
		
		((JavascriptExecutor)driver).executeScript("window.open('about:blank','_blank')");
		//driver.get("http://gmail.com");
		
		
		// array list for geeting tab
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("http://gmail.com");
		driver.switchTo().window(tabs.get(2));


		
		Thread.sleep(5000);
		driver.close();
		/*Difference between in driver.close() and driver.quit()
		 * driver.close()==> It will close the browser tabs
		 * driver.quit()==> It will quit the browser
		 * */
		
		
		
		
	}

}
