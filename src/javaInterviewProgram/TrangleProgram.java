package javaInterviewProgram;

import java.util.Scanner;

public class TrangleProgram {

	public static void main(String[] args)
	{
		// Program of trangle print get value from the user
		/*
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter the number");
		int value = myobj.nextInt();
		//System.out.println(value);
		int num = 1;
		
		for(int i = 0; i<value ; i++)
		{
			for(int j = 0; j<i ; j++)
			{
				System.out.print(num);
				
				num = num + 1;
				
			}
			System.out.println();
		}*/
		
		
		//Program of print the trangle integer value
		
		int n = 4, num = 1;
		for(int i =0; i<n; i++)
		{
			for(int j = 0 ; j< i ; j++)
			{
				System.out.print(num);
				num = num + 1;
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
