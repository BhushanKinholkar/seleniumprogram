package javaInterviewProgram;

import java.util.Scanner;

public class ReverseStringValueGet {

	public static void main(String[] args) 
	{
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter the string value");
		String name = myobj.nextLine();
		System.out.println(name);
	
		int count = name.length();
		System.out.println(count);
		
		String mreversevalue = "";
		
		for(int i = count-1; i>=0;i--)
		{
			 mreversevalue =  mreversevalue + name.charAt(i);
		}
		
		System.out.println(mreversevalue);
		
		
		
		
		
	}

}
