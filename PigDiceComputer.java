import java.util.Scanner;
import static java.lang.System.*;

public class PigDiceComputer {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(in);

		int roll, total;

		total = 0;

		do {
			roll = 1 + (int) (Math.random() * 6);
			out.println("Computer rolled a " + roll +".");

			if (roll == 1) {
				out.println("\tThat ends its turn.");
				total = 0;
			}

			else {
				total += roll;
				out.println("\tComputer has " + total + " points so far this round.");

				if (total < 20)
					out.println("\tComputer rolls again.");
			}
		} while (roll != 1 && total < 20);

		out.println("Computer ends the round with " + total + " points.");
	}
}