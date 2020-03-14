package javaInterviewProgram;

public class PallindromNumberProgram {

	public static void main(String[] args)
	{
		int num = 121;
		int originalnumber = num;
		int reminder, reversevalue = 0;
		while(num != 0)
		{
			reminder = num % 10;
			reversevalue = reversevalue * 10 + reminder;
			num /= 10;
			
		}
		
		if(originalnumber == reversevalue)
			System.out.println("Number is pallindrom");
		else
			System.out.println("Not pallindrom");
	}
	
}
