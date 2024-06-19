package JavaBasics;

import java.util.Scanner;

public class AreaOfTria {
	
	public static double area(double b, double h)
	{
		double areaOfTriangle = 0.5 * b * h;
		
		return areaOfTriangle;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Breadth ");
		double b = sc.nextDouble();
		

		System.out.println("Enter the height ");
		double h = sc.nextDouble();

		
		System.out.println("Area of Triangle is: "+ (AreaOfTria.area(b, h)));
	}

}
