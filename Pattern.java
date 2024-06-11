package com.statement;
import java.util.*;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int input = sc.nextInt();
		
		for(int i =1 ; i <=input ; i++) {
			for(int j= 1;j<=i ; j++) {
				if(i == 5 && j > 2)	{
					System.out.print(5 - j + 3 + " ");
				}else {
					System.out.print(j + " ");
				}
				
			}
			System.out.println();
		}
	}

}