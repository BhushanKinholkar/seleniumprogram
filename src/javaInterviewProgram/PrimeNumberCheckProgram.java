package javaInterviewProgram;

public class PrimeNumberCheckProgram {

	public static void main(String[] args) 
	{
		int num = 100;

		for(int j = 1 ; j <= num ; j++)
		{
			int temp = 0;
			int val = j-1;
			
			for (int i = 2 ; i<=val; i++)
			{
				if(j % i == 0)
				{
					temp = temp + 1;
				}
			}
			if(temp == 0 )
			{
				System.out.println(j);
			}
					
		}
		
	
	}

}
