package javaInterviewProgram;

public class PrimeNumberProgram {

	public static void main(String[] args)
	{
		int num = 9;
		int temp = 0;
		int val = num-1;
		
		for(int i = 2; i<= val; i++)
		{
			if(num % i == 0)
			{
				temp = temp + 1;
				
			}
		}
		
		if(temp>0)
		{
			System.out.println("Not prime");
		}
		else
		{
			System.out.println("Prime");
		}
		
	}

}
