import java.util.Scanner;
import static java.lang.System.*;

public class ThereAndBackAgain {
	public static void erebor() {
		out.println("There.");
	}

	public static void main(String [] args) {
		out.println("Here.");
		erebor();
		out.println("Back first.");
		// erebor();
		out.println("Back second.");
	}
}