package JavaBasics;

import java.util.Scanner;

public class PrintTable {
	
	public void table(int num)
	{
		System.out.println("Multiplication table for " + num + ":");
		for(int i = 1; i<=10;i++)
		{
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value ");
		int num = sc.nextInt();
		
		
		PrintTable p1 = new PrintTable();
		p1.table(num);
	}

}
