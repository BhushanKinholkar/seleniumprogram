package testng_program;

import org.testng.annotations.Test;

public class TestNgDependency 
{
	
	/*
	 * dependonMethods => it will be depends on partular method
	 * suppose particular method failed the remaining method will failed.
	 * suppose particular method passed the remaining method will passed.
	 * */
	@Test
	public void loginTest()
	{
		System.out.println("login test method");
		//int i = 9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest()
	{
		System.out.println("Home page test method");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void SearchPagaTest()
	{
		System.out.println("Search page test method");
	}

}
