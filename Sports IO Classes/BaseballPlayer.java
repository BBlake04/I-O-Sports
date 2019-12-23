
public class BaseballPlayer extends SportsPlayerAbstract{	// Class with some initialized parameters and setters/getters
	String handing; // BaseballPlayers unique variables.
	int battingPosition;

	public BaseballPlayer() {

	}

	public BaseballPlayer(int age, String firstName, String lastName, String team, String position, String handing,
			int battingPosition) {
		super(age, firstName, lastName, team, position);
		setBattingPosition(battingPosition);
		setHanding(handing);
	}

	public void setBattingPosition(int battingPosition) {
		this.battingPosition = battingPosition;
	}

	public void setHanding(String handing) { // Only Right-handed, Left-handed, or both
		this.handing = handing;
	}

	public void doThis() {
		System.out.println("I hit something.\n");
	}
	
	public String getSport(){ // Method for the equal test.
		String sport = "Baseball";
		
		return sport;
	}
}
