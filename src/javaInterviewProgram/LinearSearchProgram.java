package javaInterviewProgram;

public class LinearSearchProgram {

	public static void main(String[] args) 
	{
		int[] arr = { 3, 4, 1, 7, 5 }; 
        int n = arr.length; 
          
        int x = 7; 
  
        int index = search(arr, n, x); 
        if (index == -1) 
            System.out.println("Element is not present in the array"); 
        else
            System.out.println("Element found at position " + index); 
	}
	
	public static int search(int[] arr, int x, int n)
	{
		for (int i = 0; i < n; i++) { 
            // Return the index of the element if the element 
            // is found 
            if (arr[i] == x) 
                return i; 
        } 
  
        // return -1 if the element is not found 
        return -1; 
		
	}
	

}
