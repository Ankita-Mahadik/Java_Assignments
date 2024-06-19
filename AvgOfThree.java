package JavaBasics;

import java.util.Scanner;

public class AvgOfThree {
	
	public static int avg(int a, int b, int c)
	{
		int average = (a + b + c)/3;
		
		return average;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st value ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd value ");
		int num2 = sc.nextInt();
		System.out.println("Enter 3rd value ");
		int num3 = sc.nextInt();
		
		System.out.println("Average of 3 numbers is: "+ AvgOfThree.avg(num1, num2, num3));

	}

}
