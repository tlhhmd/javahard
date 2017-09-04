import java.util.Scanner;
import static java.lang.System.*;

public class DictionaryOrder {
	public static void main( String[] args) {
		// Scanner keyboard = new Scanner(in);
		// String name;

		out.print("Gimme the name of a made-up programming language: ");
		// name = keyboard.nextLine();
		String name = new Scanner(in).nextLine();

		name = name.toLowerCase();

		/* Unlike .next(), .nextline() reads spaces, tabs, etc. */

		if (name.compareTo("c++") < 0)
			out.println(name + " comes before c++");
		if (name.compareTo("c++") == 0)
			out.println("c++ isn't a made-up language!");
		if (name.compareTo("c++") > 0)
			out.println(name + " comes after c++");

		if (name.compareTo("go") < 0)
			out.println(name + " comes before go");
		if (name.compareTo("go") == 0)
			out.println("go isn't a made-up language!");
		if (name.compareTo("go") > 0)
			out.println(name + " comes after go");

		if (name.compareTo("java") < 0)
			out.println(name + " comes before java");
		if (name.compareTo("java") == 0)
			out.println("java isn't a made-up language!");
		if (name.compareTo("java") > 0)
			out.println(name + " comes after java");

		if (name.compareTo("lisp") < 0)
			out.println(name + " comes before lisp");
		if (name.compareTo("lisp") == 0)
			out.println("lisp isn't a made-up language!");
		if (name.compareTo("lisp") > 0)
			out.println(name + " comes after lisp");

		if (name.compareTo("python") < 0)
			out.println(name + " comes before python");
		if (name.compareTo("python") == 0)
			out.println("python isn't a made-up language!");
		if (name.compareTo("python") > 0)
			out.println(name + " comes after python");

		if (name.compareTo("visual basic") < 0)
			out.println(name + " comes before visualbasic");
		if (name.compareTo("visual basic") == 0)
			out.println("visual basic isn't a made-up language!");
		if (name.compareTo("visual basic") > 0)
			out.println(name + " comes after visual basic");

	}
}