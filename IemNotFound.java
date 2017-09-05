import static java.lang.System.*;
import java.util.Scanner;

public class IemNotFound {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(in);

		String[] heroes = {
			"RZA", "GZA", "Raekwon", "Method Man",
			"Ghostface Killah", "U-God", "Masta Killa",
			"Ol' Dirty Bastard", "Inspectah Deck",
			"Cappadonna"
		};

		String guess;
		boolean found = false;

		out.print("Pop quiz! Name a member of the Wu-Tang Clan: ");
		guess = keyboard.next();

		for (String hero : heroes)
			if (guess.equals(hero)) {
				out.println("Yeah!");
				found = true;
			}

		if (!found)
			out.println("Nope!");
	}
}