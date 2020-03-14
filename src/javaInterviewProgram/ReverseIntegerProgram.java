package javaInterviewProgram;

public class ReverseIntegerProgram {

	public static void main(String[] args)
	{
		int num = 12345;
		int gValue, cValue = 0;
		
		while(num > 0)
		{
			gValue = num % 10;
			cValue= cValue * 10 + gValue;
			num /= 10;
			
		}
		System.out.println(cValue);
		
	}

}
