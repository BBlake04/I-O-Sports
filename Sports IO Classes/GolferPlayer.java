
public class GolferPlayer extends SportsPlayerAbstract {	// Class with some initialized parameters with some setters/getters/actions
	public String mainSponser; // GolferPlayers unique variable.

	public GolferPlayer() {

	}

	public GolferPlayer(int age, String firstName, String lastName, String team, String position, String mainSponser) {
		super(age, firstName, lastName, team, position);
		setMainSponser(mainSponser);
	}

	public void setMainSponser(String mainSponser) {
		this.mainSponser = mainSponser;
	}

	public void doThis() {
		System.out.println("I putt it in the hole.\n");
	}
	
	public String getSport(){ // Method for the equal test.
		String sport = "Golf";
		
		return sport;
	}
}
