package Handling;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("Enter the numera :");
			int numerator=scanner.nextInt();
			System.out.println("Enter the denomina");
			int denominator=scanner.nextInt();
			int result=numerator/denominator;
			System.out.println("Result :"+result);
		}
		catch(ArithmeticException e) {
			System.out.println("Error is :"+e.getMessage());
		}
		finally {
			System.out.println("Program has ended");
		}

	}
}
