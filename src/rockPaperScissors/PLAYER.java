package rockPaperScissors;
import java.util.Scanner;
import rockPaperScissors.Roshambo.CHOICES;

public abstract class PLAYER {
	
	Scanner scnr;
	
	public PLAYER()
	{
		super();
		scnr = new Scanner (System.in);
	}
public CHOICES getChoice()
{ 
	System.out.println("Please enter your choice: R=Rock, P=Paper, S=Scissors");
char playerChoice = scnr.nextLine().toUpperCase().charAt(0);

switch (playerChoice)
{
case 'R':
	return CHOICES.ROCK;
case 'P':
		return CHOICES.PAPER;
case 'S':
	return CHOICES.SCISSORS;
}
//if neither of the above choices it is invalid input.
System.out.println("Invalid input!");
return getChoice();
}
}
