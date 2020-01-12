package testng_program;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgNotes 
{
	
	/* :------------TestNG notes:----------
	 * It is use for desgin the test cases in systematic way
	 * TestNG open source fee
	 * Jar file
	 * It is Java testing framework
	 * Advantage:
	 * It will generate good HTml report 
	 * It will proved annotation
	 * priority bases test case execution
	 * sequence wise test case design
	 * dependency is there
	 * grouping
	 * data provider feature
	 * TDD framework(Test Driven Development)
	 *
	 *Output
	 *	system property
		method one is executed
		launch the chrome browser
		Enter teh URl
		verify the page title	
		this is method 5 data
		this is method 6
		Method 7 data
	 *
	 * */
	
	@BeforeSuite//1
	public void setup()
	{
		System.out.println("system property");
	}
	@BeforeTest//2
	public void method1()
	{
		System.out.println("method one is executed");
	}
	@BeforeClass//3
	public void LaunchBrowser()
	{
		System.out.println("launch the chrome browser");
	}
	
	@BeforeMethod//4
	public void EURL()
	{
		System.out.println("Enter teh URl");
	}
	
	@Test//5
	public void titlechecl()
	{
		System.out.println("verify the page title");
		
	}
	
	@Test
	public void democheck()
	{
		System.out.println("verify the demo check method");
	}
	
	@Test
	public void sample()
	{
		System.out.println("Sample check the value");
	}
	
	@AfterMethod//6
	public void method5()
	{
		System.out.println("this is method 5 data");
	}
	
	@AfterClass//7
	public  void method6()
	{
		System.out.println("this is method 6");
	}
	@AfterTest//8
	public void methid7()
	{
		System.out.println("Method 7 data");
	}
	@AfterSuite
	public void close()
	{
		System.out.println("Method close id define");
	}

}
