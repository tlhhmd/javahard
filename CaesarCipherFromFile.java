import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import static java.lang.System.*;

public class CaesarCipherFromFile {
	public static char shiftLetter(char c, int n) {
		int ch = c;

		if (!Character.isLetter(c))
			return c;

		ch += n;

		if (Character.isUpperCase(c) && ch > 'Z' || Character.isLowerCase(c) && ch > 'z')
			ch -= 26;

		if (Character.isUpperCase(c) && ch < 'A' || Character.isLowerCase(c) && ch < 'a')
			ch += 26;

		return (char) ch;
	}

	public static void main(String [] args) throws Exception {
		Scanner fileIn = new Scanner(new File("input.txt"));
		Scanner keyboard = new Scanner(in);

		String plaintext, cipher = "", filename = "output.txt";

		int shift;

		plaintext = fileIn.nextLine();
		fileIn.close();

		out.print("Shift (0-26): ");
		shift = keyboard.nextInt();

		for (int i = 0; i < plaintext.length(); i++)
			cipher += shiftLetter(plaintext.charAt(i), shift);

		File moo = new File(filename);

		if (moo.createNewFile())
			out.println ("New file created.");

		PrintWriter doo = new PrintWriter(new FileWriter(filename));
		doo.println(cipher);
		doo.close();
	}
}