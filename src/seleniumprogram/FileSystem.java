package seleniumprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileSystem
{
	@Test
	public void Uploaddoucment()
	{
		// gecodriver file path
		System.setProperty("", "");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://i3claim.demo.i3systems.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("abcxu")).sendKeys("Admin_QA");
		driver.findElement(By.name("password")).sendKeys("i3systems");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.linkText("DOCUMENT LIST")).click();
		
		// upload doucment
		
		WebElement uploaddocument = driver.findElement(By.id("upladdoc"));
		uploaddocument.sendKeys("c:\\myfile.jpg");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		uploaddocument.sendKeys("c:\\myfile.zip");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		uploaddocument.sendKeys("c:\\myfile.pdf");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		uploaddocument.sendKeys("c:\\myfile.tiff");

		driver.quit();
		
		
		
	}

}
