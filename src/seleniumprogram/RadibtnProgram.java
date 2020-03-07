package seleniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadibtnProgram {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		//Radio btn program
		List<WebElement> list = driver.findElements(By.name("webform"));
		int sizevalue = list.size();
		System.out.println("radio btn size is" + sizevalue);
		Boolean btnvalue = list.get(0).isSelected();
		System.out.println(btnvalue);
		
		if(btnvalue==true)
		{
			list.get(1).click();
		}
		else
		{
			list.get(0).click();
		}

		
		
		
	}

}
