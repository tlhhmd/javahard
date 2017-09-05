import static java.lang.System.*;

public class NestingLoops {
	public static void main (String[] args) {

		for (char c = 'A'; c <= 'E'; c++)
			for (int n = 1; n <= 3; n++)
				out.println(c + " " + n);

		out.println("\n");

		for (int a = 1; a <= 3; a++) {
			for (int b = 1; b <= 3; b++)
				out.print("(" + a + "," + b + ") ");

			out.println();
		}

		out.println("\n");
	}
}