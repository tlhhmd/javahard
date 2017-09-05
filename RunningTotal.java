import java.util.Scanner;
import static java.lang.System.*;

public class RunningTotal {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(in);

		int current, newtotal, total = 0;

		out.print("Type in a bunch of values and I'll add em up.\nI'll stop when you type zero.\n");

		
		do {
			out.print("Value: ");
			current = keyboard.nextInt();
			newtotal = current + total;
			total = newtotal;
			out.println("The total so far is " + total);
		} while (newtotal != 20);

		/*
		// While loop version
		current = 69;

		while (current != 0) {
			out.print("Value: ");
			current = keyboard.nextInt();
			int newtotal = current + total;
			total = newtotal;
			out.println("The total so far is " + total);

		}
		*/
	
		out.println("Final total: " + total);
	}
}