import static java.lang.System.*;

public class ArrayIntro {
	public static void main(String [] args) {
		String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

		// A "for-each loop"
		for (String p : planets)
			out.println(p + "\t" + p.toUpperCase());
	}
}