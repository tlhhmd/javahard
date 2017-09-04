import java.util.Scanner;
import static java.lang.System.*;

public class SafeSquareRoot {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(in);
		double x, y;
		String ifNeg = "";

		out.println("Gimme a number and I'll find the sqrt. No negatives, please.");
		x = keyboard.nextDouble();

/*
		while (x < 0) {
			out.print("NO NEGATIVES!!!!!!!!: ");
			x = keyboard.nextDouble();
		}

*/

		if (x < 0) {
			x = Math.abs(x);
			ifNeg = "i";
		}

		y = Math.sqrt(x);

		out.println("The sqrt of " + x + " is " + y + ifNeg);

	}
}