package rockPaperScissors;

public class Game extends Roshambo{
	private PLAYER player;
	private Computer computer;
	private CHOICES playersChoice;
	private CHOICES computerChoice;
	private RESULTS result;
	private static int wins;
	private static int lose;
	private static int ties;
	
	public Game()
	{
		super();
		player = new PLAYER();
		computer = new Computer();
		
	}
	public void play()
	{
		playersChoice = player.getChoice();
		computerChoice = computer.getChoice();
		result = getResults();
		displayResults();
		stats();
	}
	 
	public void displaystats()
	{
		System.out.println("You have played " + (wins + lose +ties));
		System.out.println("You have won " + wins + " times ");
		System.out.println("You have lost" + lose + "times ");
		System.out.println("The tie happened" + ties + "times.\nGood Bye");
	}
		
	private void stats()
	{
		if (result == RESULTS.WIN)
wins++;
else if (result == RESULTS.LOSE)
	lose++;
	else
		ties++;
	}
		
	
	private void displayResults()
	{
      switch (result)
	
		{
	case WIN:
	System.out.println(playersChoice + "beats" + computerChoice + ".Player WINS");
	break;
	case LOSE:
		System.out.println(playersChoice + "loses to " + computerChoice+ ". Computer WINS");
		break;
	case TIE:
		System.out.println (playersChoice + "equals to " + computerChoice + " . It's a Tie");
		break;
}
}
	
public RESULTS getResults()
{
	if (playersChoice == computerChoice)
		return RESULTS.TIE;
	
	switch(playersChoice)
	{
	case ROCK:
		return (computerChoice ==CHOICES.SCISSORS ? RESULTS.WIN : RESULTS.LOSE);
	case PAPER:
		return (computerChoice == CHOICES.ROCK ? RESULTS.WIN : RESULTS.LOSE);
	case SCISSORS:
		return (computerChoice == CHOICES.SCISSORS ? RESULTS.WIN : RESULTS.LOSE);
	}
	return RESULTS.LOSE;
}
}
