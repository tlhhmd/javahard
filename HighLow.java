import java.util.Scanner;
import static java.lang.System.*;

public class HighLow {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(in);
		int secret, guess;

		secret = 1 + (int) (Math.random() * 100);

		out.println("I'm thinking of a number between 1-100. Guess!");
		guess = keyboard.nextInt();

		while (secret != guess){
			
			if (guess < secret)
				out.print("Too low.");
			
			else if (guess > secret)
				out.print("Too high.");

			out.print(" Try again?: ");
			guess = keyboard.nextInt();
		}

		out.println("Correct!");
	}
}