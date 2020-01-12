package testng_program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRediffmail 
{
	WebDriver driver;
	@BeforeMethod
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void Verifytitle()
	{
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
	}
	
	@Test
	public void VerifyLogo()
	{
		 boolean vvalue= driver.findElement(By.xpath("//img[@class='n_redifflogo']")).isDisplayed();
		 System.out.println(vvalue);
	}
	
	@Test
	public void VerifyLink()
	{
		driver.findElement(By.linkText("Sign in")).isDisplayed();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
