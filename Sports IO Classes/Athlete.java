
public class Athlete extends Person{	// Class with some initialized parameters and some setters
		public String team;
		
		public Athlete(){
			
		}

		public Athlete(int age, String firstName, String lastName, String team, String position) {
			super(age, firstName, lastName);
			setTeam(team);
			setPosition(position);
		}
		
		public void setTeam(String team) {
			this.team = team;
		}
		
		public void setPosition(String position) {
			this.position = position;
		}
		
	}
	
