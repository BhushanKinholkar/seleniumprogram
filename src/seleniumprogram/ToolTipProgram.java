package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipProgram {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/social-icon.html");
		String expected  = "Github";
		
		WebElement githubicon = driver.findElement(By.xpath("//div[@class='soc-ico show-round']/a[4]"));
		String actualval = githubicon.getAttribute("title");
		
		if(actualval.equals(expected))
		{
			System.out.println("correct tooltip");
		}
		
	}

}
