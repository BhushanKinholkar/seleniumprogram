package seleniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownValueProgram {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		/*
		Select dropvalue = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		//dropvalue.selectByVisibleText("KINGMAN REEF");
		dropvalue.selectByIndex(10);*/
		
		//getoption
		Select oselct = new Select(driver.findElement(By.name("country")));
		List<WebElement> elementcount = oselct.getOptions();
		int valuecount = elementcount.size();
		for(int i=0;i<valuecount;i++)
		{
			String nameoption = elementcount.get(i).getText();
			System.out.println(nameoption);
			
			if(nameoption.equals("ANTARCTICA"))
			{
				oselct.selectByIndex(i);
				
			}
			
		}
		
		
		
	}

}
