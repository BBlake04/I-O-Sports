
public class BasketballPlayer extends SportsPlayerAbstract{
	public String rival; // BasketballPlayers unique variable.

	public BasketballPlayer() {

	}

	public BasketballPlayer(int age, String firstName, String lastName, String team, String position, String rival) {
		super(age, firstName, lastName, team, position);
		setRival(rival);
	}

	public void setRival(String rival) {
		this.rival = rival;
	}

	public void doThis() {
		System.out.println("I made it in the basket.\n");
	}
	
	public String getSport(){ // Method for the equal test.
		String sport = "Basketball";
		
		return sport;
	}
}
