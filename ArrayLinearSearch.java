import static java.lang.System.*;
import java.util.Scanner;

public class ArrayLinearSearch {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(in);

		int[] orderNumbers = {12345, 54321, 78753, 101010, 8675309, 31415, 217828};
		int toFind, x = 0;

		out.println("Length: " + orderNumbers.length);

		out.print("Orders: ");

		for (int num: orderNumbers)
			out.print(num + " ");

		out.print("\n\nWhich order to find? ");
		toFind = keyboard.nextInt();

		for (int num: orderNumbers)
			if (num == toFind) {
				out.println(num + " found.");
				x = 1;
			}

		if (x == 0)
			out.println(toFind + " NOT FOUND");
	}
}