
public class Person extends Name {
	public String position; // Data created here for Person array and Athlete class to inherit.
	
	public int age;

	Person() {

	}

	public Person(int age, String firstName, String lastName) {
		super(firstName, lastName);
		setAge(age);
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSport() {
		return null;

	}
}
