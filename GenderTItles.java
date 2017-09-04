import java.util.Scanner;
import static java.lang.System.*;

public class GenderTitles {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner(System.in);

		String title;

		out.print("First name: ");
		String first = keyboard.next();

		out.print("Last name: ");
		String last = keyboard.next();

		out.print("Gender (M/F): ");
		String gender = keyboard.next();

		out.print ("Age: ");
		int age = keyboard.nextInt();

		if (age < 20)
			title = first;

		else
			if (gender.equals("F")) {
				out.print ("Are you married, "+first+"? (Y/N): ");
				String married = keyboard.next();
				// married's scope is confined to this if-else statement. Once the curly brace
				// closes, it's no longer accessible

				if (married.equals("Y"))
					title = "Mrs.";

				else
					title = "Ms.";
			}

			else
				title = "Mr.";

		out.println("\n" + title + " " + last);
	}
}