package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");

		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Hot Meals")).click();
			
		
		
	}

}
