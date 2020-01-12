package testng_program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgPriority 
{
	/*
	 * Test case all always intedendent
	 * Before method not count in test case
	 * 
	 *--- priority base test cases----
	 *----Grous base test cases----
	 * */
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
	
	@Test(priority = 1,groups="Title")
	public void Verifytitle()
	{
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
	}
	
	@Test(priority = 3, groups="Logo")
	public void VerifyLogo()
	{
		 boolean vvalue= driver.findElement(By.xpath("//img[@class='n_redifflogo']")).isDisplayed();
		 System.out.println(vvalue);
	}
	
	@Test(priority = 2, groups="Link")
	public void VerifyLink()
	{
		driver.findElement(By.linkText("Sign in")).isDisplayed();
	}
	
	@Test(priority = 4, groups="Test")
	public void methodsame()
	{
		System.out.println("Test define");
	}
	
	@Test (priority = 5, groups="Test")
	public void methoddemo()
	{
		System.out.println("Test demo");
	}
	
	@Test (priority = 6, groups="Test")
	public void methodcast()
	{
		System.out.println("Test cast");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
