//1. Finding area and perimeter of rectangle or circle.

import java.util.Scanner;

public class Area {

	public static void main(String[]args)
	{
		//Taking input radius and calculating area and perimeter of circle
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius :");
	    double radius=sc.nextDouble();
	    double areacir=3.14*radius*radius;
		double perimetercir=2*3.14*radius;
		
		//Taking input l,w and calculating area and perimeter of rectangle
		System.out.println("Enter the length and width :");
		double length=sc.nextDouble();
		double width=sc.nextDouble();		
		double arearec=length*width;
		double perimeterrec=2*length+width;
		
		//Printing area and perimeter for circle and rectangle.
		System.out.println("Area of circle : \n"+areacir);
		System.out.println("Perimeter of circle : \n"+perimetercir);
		System.out.println("Area of Rectangle :\n"+arearec);
		System.out.println("Perimeter of Rectangle :\n"+perimeterrec);
		sc.close();
	}
	
}
