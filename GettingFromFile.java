import java.util.Scanner;
import java.io.File;

import static java.lang.System.*;

public class GettingFromFile {
	public static void main(String [] args) throws Exception {
		Scanner fileIn = new Scanner(new File("name-and-numbers.txt"));

		int a, b, c, sum;
		String name;

		out.println("Getting name and 3 numbers from file... ");
		
		name = fileIn.nextLine();
		
		a = fileIn.nextInt();
		b = fileIn.nextInt();
		c = fileIn.nextInt();

		fileIn.close();

		out.println("done.");
		out.println("Your name is " + name);
		out.println(a + " + " + b + " + " + c + " = " + (a + b + c));
	}
}