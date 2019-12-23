
public class HockeyPlayer extends SportsPlayerAbstract{
	String stickBrand; // HockeyPlayers unique variable.

	HockeyPlayer() {

	}

	HockeyPlayer(int age, String firstName, String lastName, String team, String position, String stickBrand) {
		super(age, firstName, lastName, team, position);
		setStickBrand(stickBrand);
	}

	public void setStickBrand(String stickBrand) {
		this.stickBrand = stickBrand;
	}

	public void doThis() {
		System.out.println("I sit in a penalty box.\n");
	}
	
	public String getSport(){ // Method for the equal test.
		String sport = "Hockey";
		
		return sport;
	}
}