
import java.util.Scanner;


public class RoshamboApp2 {
	
	public static void main(String []args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String humanName = Validator.getString(scnr, "Enter your name: ");
		System.out.println("Hello " + humanName + "!");
		
		RandomPlayer = new RandomPlayer("Scott");
		int oponnent = Validator.getInt(scnr, "Select opponent (1 or 2"):," 1,2");
		
		
	}

}
