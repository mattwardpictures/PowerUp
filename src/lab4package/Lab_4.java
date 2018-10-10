package lab4package;

import java.util.Scanner;

public class Lab_4 {

	public static void main(String[] args) {

		String userPrompt = "Y";

		int userInt;
		long i;

		Scanner scan = new Scanner(System.in);

		do { // Do the following for as long as userPrompt = "Y"
				// Request user input:
			System.out.println("Please enter an integer.");
			userInt = scan.nextInt();

			System.out.println(" "); // Whitespace padding to make it look neat
			// The formatting below ("%-10s") means that we're formatting a column that is
			// left-justified, that is 10 spaces wide.
			System.out.printf("%-10s %-10s %-10s %n", "Number", "Squared", "Cubed");
			System.out.printf("%-10s %-10s %-10s %n", "======", "=======", "=====");

			for (i = 1; i <= userInt; i++) {
				// Since Math.pow renders a double, explicit casting is required.
				System.out.printf("%-10s %-10s %-10s %n", (long) i, (long) Math.pow(i, 2), (long) Math.pow(i, 3));
			}

			System.out.println(" ");
			System.out.println("Press Y to continue, Press any other key to quit.");
			userPrompt = scan.next();

		} while (userPrompt.equalsIgnoreCase("Y"));

		System.out.println("Very well. Goodbye.");
		scan.close();
	}

}