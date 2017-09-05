import java.util.Scanner;

import static java.lang.System.*;

public class CountingFor {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(in);

		int n;

		for (n = 1; n <= 1000; n+=n)
			out.println(n);

		for ( ; n > 0; n--)
			out.println(n);
	}
}