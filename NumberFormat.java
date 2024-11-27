package Number;
import java.util.Scanner;

public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("Enter the Number:");
			String input=scanner.next();
			int num=Integer.parseInt(input);
			System.out.println("You Enterd:"+num);
		}
		catch(NumberFormatException e) {
			System.out.println("Error:ivalid number format"+e.getMessage());
		}
		finally {
			scanner.close();
		}

	}

}
