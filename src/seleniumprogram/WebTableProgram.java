package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableProgram {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		 String innertext = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		 System.out.println(innertext);
	}

}
