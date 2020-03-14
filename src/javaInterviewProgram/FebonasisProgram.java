package javaInterviewProgram;

import java.util.Scanner;

public class FebonasisProgram {

	public static void main(String[] args)
	{
		/*
		int num = 10;
		int a =0, b = 1;
		int sum;
		for(int i = 0 ; i < num ; i++)
		{
			  System.out.println(a);
			  sum = a + b;
			  a = b;
			  b = sum ;
		}
		
		*/
		
		
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter the number");
		int value = myObj.nextInt();
		int t1 = 1,t2 = 2, sum ;
		
		for(int i = 1; i <= value ; i++)
		{
			System.out.println(t1);
			sum = t1 + t2 ;
			t1 = t2;
			t2 = sum;
			
		}
		
		
		
		
	}

}
