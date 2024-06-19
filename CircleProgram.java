package JavaBasics;

import java.util.Scanner;

public class CircleProgram {
	
	public static double areaOfCircle(double r)
	{
		double area = 3.14 * r * r;
		
		return area;
	}
	
	public static double periOfCircle(double r)
	{
		double perimeter = 2 * 3.14 * r;
		
		return perimeter;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius ");
		double r = sc.nextDouble();
		
		System.out.println("Area of Circle is : "+ CircleProgram.areaOfCircle(r));
		System.out.println("Perimeter of Circle is: "+ CircleProgram.periOfCircle(r));

	}

}
