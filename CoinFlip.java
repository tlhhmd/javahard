import java.util.Scanner;
import static java.lang.System.*;

public class CoinFlip {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(in);

		String coin, again;
		int flip, streak = 0;

		/*
		do {
			flip  = 1 + (int) (Math.random() * 2);

			if (flip == 1)
				coin  = "HEADS";

			else
				coin = "TAILS";

			out.println ("You flip a coin and it's " + coin);

			if (flip == 1) {
				streak ++;
				out.print("\tThat's " + streak + " in a row.\n\tFlip again? ");
				again = keyboard.next();
			}

			else {
				// streak = 0; <-- This doesn't seem right.
				again = "n";
			}

		} while (again.equals("y"));
		*/

		again = "y";

		while (again.equals("y")) {
			flip  = 1 + (int) (Math.random() * 2);

			if (flip == 1)
				coin  = "HEADS";

			else
				coin = "TAILS";

			out.println ("You flip a coin and it's " + coin);

			if (flip == 1) {
				streak ++;
				out.print("\tThat's " + streak + " in a row.\n\tFlip again? ");
				again = keyboard.next();
			}

			else {
				// streak = 0; <-- This doesn't seem right.
				again = "n";
			}
		}

		out.println("Final score: " + streak);

	}
}