package testng_program;

import org.testng.annotations.Test;

public class InvocationCount 
{
	//Don't create separate ten time Test Cases
	/*
	@Test(invocationCount=10)
	public void sum()
	{
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}-*/
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void test1()
	{
		String  x = "100A";
		Integer.parseInt(x);
		
	}
	
	

}
