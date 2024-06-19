package JavaBasics;

import java.util.Scanner;

public class SwapVal {
	
	public static void swap(int a, int b)
	{
		
		 System.out.println("Before swapping: a = " + a + ", b = " + b);
		
		  int temp = a;
	        a = b;
	        b = temp;
		
		 System.out.println("After swapping: a = " + a + ", b = " + b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st value ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd value ");
		int num2 = sc.nextInt();
		
		SwapVal.swap(num1, num2);

	}

}
