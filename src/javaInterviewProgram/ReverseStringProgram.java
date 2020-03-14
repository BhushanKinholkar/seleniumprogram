package javaInterviewProgram;

public class ReverseStringProgram {

	public static void main(String[] args) 
	{
		String name = "Automation";
		System.out.println("Original value is " + name);
		int count = name.length();
		System.out.println(count);
		String mreverse = "";
		
		for(int i= count-1; i>=0; i--)
		{
			   mreverse = mreverse + name.charAt(i);
		}
		System.out.println(mreverse);
		
		
	}

}
