//9.	Check if a number is Armstrong number.

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		    int sum=0;
			Scanner sc=new Scanner(System.in);
				
		
			System.out.println("Enter the number you want to check:");
			 int num=sc.nextInt();
			
			int i=num;					
		    while(i!=0)
		    {
		       int rem=i%10;
		       sum=sum+(rem*rem*rem);
		    	i=i/10;
			}
		    
		    if(sum==num)
		         System.out.println("Number is Armstrong Number");
		    else
		    	 System.out.println("Number is not Armstrong Number");
			sc.close();
			}

}
