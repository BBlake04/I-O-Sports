
public abstract class SportsPlayerAbstract extends Athlete{
	
	public SportsPlayerAbstract(){
		
	}
	
	public SportsPlayerAbstract(int age, String firstName, String lastName, String team, String position) {
		super(age, firstName, lastName, team, position);
	}

	public abstract void doThis();
}
