package rockPaperScissors;
import Player;

public class RockPlayer extends Computer{

	
	public RockPlayer(String name) {
		super (name);
		}
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}
	

}
