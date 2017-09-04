import java.util.Scanner;
import static java.lang.System.*;

public class EnterPIN {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(in);
		int pin, entry;

		pin = 12345;

		out.println("Welcome to the Bank of Java.\nEnter your PIN: ");
		entry = keyboard.nextInt();

		while (entry != pin) {
			out.println("\nINCORRECT PIN. TRY AGAIN.");
			out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS YO YOUR ACCOUNT.");
	}
}