package rockPaperScissors;

import java.util.Scanner;

public class Play {

	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	Game game = new Game();
	char quit = ' ';
	
	while (quit !='N')
	{
		game.play();
		
		System.out.println(" Play again? Press any key to continue, or 'N' to quit");
		quit = scnr.nextLine().toUpperCase().charAt(0);
	}
	scnr.close();
	game.displaystats();

	}
}
	