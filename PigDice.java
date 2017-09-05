import java.util.Scanner;
import static java.lang.System.*;

// Fuck me if I'm gonna re-type this

public class PigDice {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(in);

		int roll, total1, total2, turnTotal;
		String choice = "";

		total1 = 0;
		total2 = 0;

		do {
			turnTotal = 0;
			out.println("You have " + total1 + " points.");

			do {
				roll = 1 + (int) (Math.random() * 6);
				out.println("You rolled a " + roll +".");

				if (roll == 1) {
					out.println("\tThat ends your turn.");
					turnTotal = 0;
				}

				else {
					turnTotal += roll;
					out.println("\tYou have " + turnTotal + " points so far this round.");
					out.println("\tROLL again or HOLD?");
					choice = keyboard.next().toLowerCase();
				}
			} while (roll != 1 && choice == "roll");

			total1 += turnTotal;
			out.println("\tYou end the round with " + total1 + " points.");

			if (total1 < 100) {
				turnTotal = 0;
				out.println("Computer has " + total2 + " points.");

				do {
					roll = 1 + (int) (Math.random() * 6);
					out.println("\tComputer rolled a " + roll + ".");

					if (roll == 1) {
						out.println("\tThat ends its turn.");
						turnTotal = 0;
					}

					else {
						turnTotal += roll;
						out.println("\tComputer has " + turnTotal + " points so far this round.");

						if (turnTotal < 20)
							System.out.println("\tComputer chooses to roll again.");
					}
				} while (roll != 1 && turnTotal < 20);
			}
		} while (total1 < 100 && total2 < 100);

		if (total1 > total2)
			out.println("Humanity wins!");

		else
			out.println("The computer wins.");
	}
}