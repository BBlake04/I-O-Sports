
public class FootballPlayer extends SportsPlayerAbstract{

	String specialty; // FootballPlayers unique variable.

	public FootballPlayer() {

	}

	public FootballPlayer(int age, String firstName, String lastName, String team, String position, String specialty) {
		super(age, firstName, lastName, team, position);
		setSpecialty(specialty);
	}

	public void setSpecialty(String specialty) { // Only Offense, Defense, and
													// Special-Teams.
		this.specialty = specialty;
	}

	public void doThis() {
		System.out.println("I tackled something.\n");
	}
	
	public String getSport(){ // Method for the equal test.
		String sport = "Football";
		
		return sport;
	}
}