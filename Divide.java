//7. Accept 2 no. from user for division if second no. is zero then print an error message

import java.util.Scanner;

public class Divide {
	public static void main(String[]args)
	{
		//Taking input from user
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the First no. :");
		int num1=sc.nextInt();
		System.out.println("Enter the Second no. :");
		int num2=sc.nextInt();
		
		//checking if num2 is 0
		if(num2==0)
			System.out.println("Error");
		else
		{
			int res=num1/num2;
	    		
	    System.out.println("Division is"+res);
		}
	    	
		sc.close();
	}


}
