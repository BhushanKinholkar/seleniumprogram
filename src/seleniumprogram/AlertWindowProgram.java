package seleniumprogram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindowProgram {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		//
		driver.findElement(By.name("cusid")).sendKeys("52364");
		driver.findElement(By.name("submit")).click();
		
		//Alert haldle
		Alert alert = driver.switchTo().alert();
		
		String message = driver.switchTo().alert().getText();
		System.out.println(message);
		
		alert.accept();
		
		

	}

}
