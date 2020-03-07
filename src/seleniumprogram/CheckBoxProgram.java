package seleniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxProgram {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		
		// Checkbox
		List<WebElement> checkbox = driver.findElements(By.xpath("//strong[contains(text(),'Checkbox')]//following::input[@name='webform']"));
		int checkvalue = checkbox.size();
		System.out.println(checkvalue);
		for(int i = 0; i <= checkvalue;i++)
		{
	         checkbox.get(i).click();			
		}
		
		
		
	}

}
