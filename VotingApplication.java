package Age;
import java.util.Scanner;
class IllegalArgumentException extends Exception{
	public IllegalArgumentException(String message) {
		super(message);
	}
}


public class VotingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("Enter your Age");
			int Age = scanner.nextInt();
			if(Age<18) {
				
				throw new  IllegalArgumentException("You must be 18 or older to vote");
			
			}
			System.out.println("You are eligible to vote");
		}
		catch( IllegalArgumentException e){
			System.out.println("Error:"+e.getMessage());
			
		}
		finally {
			scanner.close();
		}

	}

}
