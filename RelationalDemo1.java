package Java;
import java.util.Scanner;

public class RelationalDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Age");
		int Ajay = sc.nextInt();
		System.out.println("Age of Ajay is " + Ajay);
		if(Ajay>=18) {
			System.out.println("Eligible for Voting");
			
		}else {
			System.out.println("Not Eligible for Voting");
		}

	}

}
