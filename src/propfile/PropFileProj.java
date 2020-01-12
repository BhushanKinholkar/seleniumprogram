package propfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropFileProj {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = null;
		Properties prop = new Properties();
		FileInputStream fp = new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\seleniumprogram\\config.properties");
		prop.load(fp);
		
		System.out.println(prop.getProperty("browser"));
		String browsername= prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");
			driver = new ChromeDriver();
			 
		}else if (browsername.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Broser not supported ");
		}
		
		driver.get(prop.getProperty("url"));
		
		
		driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.xpath("//input[@id='usernamereg-password']")).sendKeys(prop.getProperty("password"));
		
	}

}
