package seleniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableProgram {

	public static void main(String[] args) 
	{
		String max;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		List  col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		
		System.out.println("col size is" + col.size());
		
		List row = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		 int value = row.size();
		 System.out.println(value);
		 
		for (int i =1 ; i < value ; i++) 
		{
			for(int j=0;j < col.size();j++)
			{
				String colvalue = driver.findElement(By.xpath("//body//tbody//tr["+(j+1)+"]")).getText();
				System.out.println(" "+ colvalue);
			}
			  
			 
		}
		 
		 
		
	}

}
