import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import static java.lang.System.*;

public class CoinFlipSaved {
	public static void main(String [] args) throws Exception {
		Scanner keyboard = new Scanner(in);
		String flips = "";

		out.print("What's your filename? ");
		String filename = keyboard.next() + ".txt";

		File moo = new File(filename);

		if (moo.createNewFile())
			out.println ("New file created.");

		else {
			out.print("What's your poison? ");
			flips = keyboard.next();

			PrintWriter doo = new PrintWriter(new FileWriter(filename));
			doo.println(flips);
			doo.close();
		}
	}
}