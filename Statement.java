package com.statement;
import java.util.Scanner;

public class Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = null;
		do{
			Scanner sc = new Scanner(System.in);
		
		System.out.println("Curiosity is Starting");
		System.out.println("Enter the Quantity : ");
		int Quantity = sc.nextInt();
		System.out.println("Enter the Price : ");
		int Price = sc.nextInt();
		float Total = Quantity * Price;
		System.out.println("Total Is : " + Total);
		System.out.println("Do you want to perform againg (y/n): ");
		sc.nextLine();
	
		}while(input.equals("Yes"));
	}
}
