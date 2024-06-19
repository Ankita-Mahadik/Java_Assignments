package JavaBasics;

import java.util.Scanner;

public class SumOfNums {
	
	public static int sum(int a, int b)
	{
		int add = 0;
		
		add = a + b;
		return add;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st value ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd value ");
		int num2 = sc.nextInt();
		
		System.out.println("Sum of 2 numbers is " +SumOfNums.sum(num1, num2));

	}

}
