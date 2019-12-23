import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) { // Coded by Brandon Blake.

		Person a[] = new Person[1000];
		// Polymorphing objects below from Person to their respective sport.
		a[0] = new BaseballPlayer();
		a[1] = new BaseballPlayer();
		a[2] = new BaseballPlayer();
		a[3] = new FootballPlayer();
		a[4] = new FootballPlayer();
		a[5] = new FootballPlayer();
		a[6] = new HockeyPlayer();
		a[7] = new HockeyPlayer();
		a[8] = new HockeyPlayer();
		a[9] = new GolferPlayer();
		a[10] = new GolferPlayer();
		a[11] = new GolferPlayer();
		a[12] = new BasketballPlayer();
		a[13] = new BasketballPlayer();
		a[14] = new BasketballPlayer();
		// End of polymorphing.

		// Begin setting objects.
		a[0].setFirstName("Hank");
		a[0].setLastName("Hill");
		a[0].setAge(31);
		a[0].setTeam("Kings of the Hill");
		a[0].setPosition("Pitcher");
		a[0].setHanding("Right-Handed");
		a[0].setBattingPosition(4);

		a[1].setFirstName("Barry");
		a[1].setLastName("Smith");
		a[1].setAge(30);
		a[1].setTeam("Barry Good");
		a[1].setPosition("Catcher");
		a[1].setHanding("Both");
		a[1].setBattingPosition(5);

		a[2].setFirstName("Guy");
		a[2].setLastName("Fieri");
		a[2].setAge(30);
		a[2].setTeam("Spicy Kings");
		a[2].setPosition("Outfielder");
		a[2].setHanding("Right-Handed");
		a[2].setBattingPosition(7);

		a[3].setFirstName("Terry");
		a[3].setLastName("Merry");
		a[3].setAge(28);
		a[3].setTeam("Cacklin' Tacklin's");
		a[3].setPosition("Wide Receiver");
		a[3].setSpecialty("Offense");

		a[4].setFirstName("Payton");
		a[4].setLastName("Danning");
		a[4].setAge(33);
		a[4].setTeam("The Bolts");
		a[4].setPosition("Quarterback");
		a[4].setSpecialty("Offense");

		a[5].setFirstName("Big");
		a[5].setLastName("Chuck");
		a[5].setAge(26);
		a[5].setTeam("Helmet Destroyers");
		a[5].setPosition("Guard");
		a[5].setSpecialty("Defense");

		a[6].setFirstName("Mario");
		a[6].setLastName("Luigi");
		a[6].setAge(27);
		a[6].setTeam("Fighting Bulls");
		a[6].setPosition("Goalie");
		a[6].setStickBrand("Puck Master");

		a[7].setFirstName("Wayne");
		a[7].setLastName("Bayne");
		a[7].setAge(25);
		a[7].setTeam("The Missing Tooth");
		a[7].setPosition("Center");
		a[7].setStickBrand("One Shot");

		a[8].setFirstName("Steve");
		a[8].setLastName("Walter");
		a[8].setAge(27);
		a[8].setTeam("Angry Titans");
		a[8].setPosition("Left Wing");
		a[8].setStickBrand("Heavy Steel");

		a[9].setFirstName("Tiger");
		a[9].setLastName("Moods");
		a[9].setAge(42);
		a[9].setTeam("The Roaring Tigers");
		a[9].setPosition("Heavy Driver");
		a[9].setMainSponser("Samsung");

		a[10].setFirstName("Phil");
		a[10].setLastName("Bill");
		a[10].setAge(39);
		a[10].setTeam("Under Par");
		a[10].setPosition("Putter");
		a[10].setMainSponser("Verizon");

		a[11].setFirstName("Mark");
		a[11].setLastName("Bark");
		a[11].setAge(36);
		a[11].setTeam("Hole in One");
		a[11].setPosition("Heavy Driver");
		a[11].setMainSponser("Google");

		a[12].setFirstName("Anthony");
		a[12].setLastName("North");
		a[12].setAge(24);
		a[12].setTeam("Nothing but Net");
		a[12].setPosition("Shooting Guard");
		a[12].setRival("Carl Wheezer");

		a[13].setFirstName("Carl");
		a[13].setLastName("Wheezer");
		a[13].setAge(25);
		a[13].setTeam("Wheezes the Best");
		a[13].setPosition("Point Guard");
		a[13].setRival("Anthony North");

		a[14].setFirstName("Curious");
		a[14].setLastName("George");
		a[14].setAge(21);
		a[14].setTeam("Never Lose");
		a[14].setPosition("Power Forward");
		a[14].setRival("None");
		// End setting objects.

		for (int i = 15; i < a.length; i++) { // Initializes all empty elements to junk data and polymorphs them to BasketballPlayers
			a[i] = new BasketballPlayer();
			a[i].setFirstName("B");
			a[i].setLastName("B");
			a[i].setAge(0);
			a[i].setTeam("B");
			a[i].setPosition("B");
			a[i].setRival("B");
		}

		Scanner sc = new Scanner(System.in);
		String input = "Blank"; // Avoid null pointer exception by initializing the variable.
		String sportInput = "Blank"; // Avoid null pointer exception by initializing the variable.
		int inputInt = 0; // Avoid null pointer exception by initializing the variable.
		boolean checker = false;
		boolean checker2 = false;
		String menu = "A. Add a new Person.\n" + "B. Display all People.\n"
				+ "C. Test to see if any two Athletes are equal.\n" + "D. Display what each Athlete does.\n"
				+ "Q. Quit.\n";

		System.out.println("Enter your choice from the menu: ");
		System.out.println(menu);

		while (!input.equals("Q")) { // Exit only when Q is input.
			input = sc.next();
			input = input.toUpperCase(); // Turn inputs into capitals for easier checking.
			if (input.equals("A") || input.equals("B") || input.equals("C") || input.equals("D") || input.equals("Q")) { // If input is one of the mentioned, proceed in loop.
				checker = true;	
			}
			if (checker == false) {
				System.out.println(input + " is not an valid option\nPlease repick a valid Option: \n" + menu);
			}
			// End of checker use.
			checker = false; // Reset to false for checker to function again.
			if (input.equals("A")) { // Create a new person choice.
				int x = 0;

				while (a[x].age >= 18) { // Checks for the last real player.
					x++;
				}
				System.out.println(
						"Enter the persons sport (Pick between Basketball, Baseball, Football, Golf, or Hockey.): ");
				sportInput = sc.next();
				sportInput = sportInput.toUpperCase();
				if (sportInput.equals("BASKETBALL") || sportInput.equals("BASEBALL") || sportInput.equals("FOOTBALL")
						|| sportInput.equals("GOLF") || sportInput.equals("HOCKEY")) {
					checker2 = true;
				}
				if (checker2 == false) {
					System.out.println("Invalid input for sport, defaulted to Basketball");
					sportInput = "BASKETBALL";
				}
				if (sportInput.equals("BASKETBALL")) {
					a[x] = new BasketballPlayer(); // Polymorph from person to BasketballPlayer.
					System.out.println("Enter the persons rival: ");
					input = sc.next();
					a[x].setRival(input);
				}
				if (sportInput.equals("BASEBALL")) {
					a[x] = new BaseballPlayer(); // Polymorph from person to BaseballPlayer.
					System.out.println("Enter the persons handing: ");
					input = sc.next();
					a[x].setHanding(input);
					System.out.println("Enter the persons batting position numerically: ");
					inputInt = sc.nextInt();
					a[x].setBattingPosition(inputInt);
				}
				if (sportInput.equals("FOOTBALL")) {
					a[x] = new FootballPlayer(); // Polymorph from person to FootballPlayer.
					System.out.println("Enter the persons specialty: ");
					input = sc.next();
					a[x].setSpecialty(input);
				}
				if (sportInput.equals("GOLF")) {
					a[x] = new GolferPlayer(); // Polymorph from person to GolferPlayer.
					System.out.println("Enter the persons main sponser: ");
					input = sc.next();
					a[x].setMainSponser(input);
				}
				if (sportInput.equals("HOCKEY")) {
					a[x] = new HockeyPlayer(); // Polymorph from person to HockeyPlayer.
					System.out.println("Enter the persons stick brand: ");
					input = sc.next();
					a[x].setStickBrand(input);
				}
				System.out.println("Enter the persons first name: ");
				input = sc.next();
				a[x].setFirstName(input);
				System.out.println("Enter the persons last name: ");
				input = sc.next();
				a[x].setLastName(input);
				System.out.println("Enter the persons age: ");
				inputInt = sc.nextInt();
				if (inputInt < 18) {
					System.out.println("Age cannot be less than 18, defaulted to 18.");
					inputInt = 18;
				}
				a[x].setAge(inputInt);
				System.out.println("Enter the persons team name: ");
				input = sc.next();
				a[x].setTeam(input);
				System.out.println("Enter the persons relevant position: ");
				input = sc.next();
				a[x].setPosition(input);

				System.out.println("\nEnter your choice from the menu: ");
				System.out.println(menu);
			}

			else if (input.equals("B")) { // Display all people choice.
				for (int i = 0; a[i].age >= 18; i++) {
					System.out.println("Person " + i + ": " + a[i].firstName + " " + a[i].lastName + ".");
				}
				System.out.println("\nEnter your choice from the menu: ");
				System.out.println(menu);
			}

			else if (input.equals("C")) { // Test for equals choice.
				int x = 0;

				while (a[x].age >= 18) { // Checks for the last real player.
					x++;
				}

				int w = 0, q = 0;
				System.out.println("Enter two player numbers to see if they play the same sport.\nFirst person's player number: ");
				w = sc.nextInt();
				System.out.println("Second person's player number: ");
				q = sc.nextInt();

				if (w < x && q < x && a[w].getSport().equals(a[q].getSport()) == true) { // Parameters to see if the players exist.
					System.out.println("The two players play the same sport.");
				}

				if (w < x && q < x && a[w].getSport().equals(a[q].getSport()) == false) {
					System.out.println("The two players don't play the same sport.");
				} else { // If entered number is out of parameter, it will lead to else statement.
					System.out.println("One of the player numbers was invalid, returning to menu.");
				}

				System.out.println("\nEnter your choice from the menu: ");
				System.out.println(menu);
			}

			else if (input.equals("D")) { // Display what every athlete does choice.
				for (int i = 0; a[i].age >= 18; i++) {
					System.out.println("Person " + i + ": " + a[i].firstName + " " + a[i].lastName + " is a "
							+ a[i].position + ".");
				}

				System.out.println("\nEnter your choice from the menu: ");
				System.out.println(menu);
			}
		}
		sc.close();
	}
}
