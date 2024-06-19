package JavaBasics;

import java.util.Scanner;

public class ReactangleProgram {
	
	public static int areaOfReact(int l, int w)
	{
		int area = l * w;
		
		return area;
	}
	
	public static int periOfReact(int l, int w)
	{
		int sum = l + w;
		
		int peri = 2 * (sum);
		
		return peri;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Length ");
		int l = sc.nextInt();
		
		System.out.println("Enter the Width ");
		int w = sc.nextInt();
		
		System.out.println("Enter your choice 1/2 : ");
		int choice = sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("Area of Reactangle is: "+ (ReactangleProgram.areaOfReact(l, w)));
				break;
			case 2:
				System.out.println("Perimeter of Reactangle is: "+ (ReactangleProgram.periOfReact(l, w)));
				break;	
			default:
                System.out.println("Invalid number. Please enter a right number");
		}
			

	}

}
