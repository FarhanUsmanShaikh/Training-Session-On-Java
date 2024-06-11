package Java;
import java.util.Scanner;

public class Arithmatic_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int num = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int num1 = sc.nextInt()	;
		
		

		
		System.out.println("a + b =" + (num + num1));
		System.out.println("a - b =" + (num - num1));
		System.out.println("a * b =" + (num * num1));
		System.out.println("a / b =" + (num / num1));

	}

}
