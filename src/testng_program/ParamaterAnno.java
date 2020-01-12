package testng_program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamaterAnno 
{
	WebDriver driver;
	
	@Test
	@Parameters({"firstname","lastname"})
	public void yahooLogin(String firstname, String lastname)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create?.src=fpctx&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.yahoo.com&specId=yidReg");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys(lastname);
		//driver.findElement(By.xpath("")).sendKeys("");
	}

}
