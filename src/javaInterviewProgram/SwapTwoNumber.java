package javaInterviewProgram;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) 
	{
		// Program for get value from user input and swaping the value
		/*
		int thirdvalue;
		
		Scanner firstnumber = new Scanner(System.in);
		System.out.println("Enter the a value");
		int firstvalue  = firstnumber.nextInt();
		System.out.println(firstvalue);
		
		Scanner secondnumber = new Scanner(System.in);
		System.out.println("Enter the b value");
		int secondvalue  = secondnumber.nextInt();
		System.out.println(secondvalue);
		
		thirdvalue = firstvalue + secondvalue;
		System.out.println("value of 3....is " + thirdvalue);
		
		firstvalue = thirdvalue-firstvalue;
		secondvalue = thirdvalue-secondvalue;
		
		System.out.println("after  swaping value");
		System.out.println("A value is..."+firstvalue);
		System.out.println("B value is..."+ secondvalue);
		*/
		
		
		// Program for without using temp variable swaping program
		/*
		int a = 10;
		int b = 20;//10

		System.out.println("Before swap a value is .. " + a);
		System.out.println();
		
		
		a = a + b;
		System.out.println(a);
		
		b=a-b;
		System.out.println("After swaping b value is...." + b);
		a=a-b;
		System.out.println("After swaping a value is....." + a);
		*/
		
		
		//Program for swaping with using temp variable
		int a = 10;
		int b = 20;
		int temp;
		
		temp = a ;
		a =  b;
		b = temp;
		
		System.out.println(temp);
		System.out.println(a);
		System.out.println(b);
		
		
		
		
	}

}
