public class CreatingVariables {
	public static void main( String[] args ){
		int x, y, age;
		double seconds, e, checking;
		String firstName, lastName, title;

		// int = integer
		// double = double-precision floating-point. Limited precision
		// float = single-precision floating-point (not used much anymore)
		// String = string

		x = 10;
		y = 400;
		age = 39;

		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;

		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";

		System.out.println("The variable x contains " + x);
		System.out.println("The value " + y + " is stored in the variable y.");
		System.out.println("The epxeriment took " + seconds + " seconds.");
		System.out.println("A favorite irrational # is Euler's number: " + e);
		System.out.println("Hopefully you have more than $" + checking + "!");
		System.out.println("My name's " + title + " " + firstName + lastName);

		/* Add four more variables to the program: another integer, another double,
		and two Strings. Name them whatever you want */

		int z = 40;
		double pi = 3.14142323294532549054390;
		String moo = "Omg", poo = "Wow";

		System.out.print(moo + poo + z);
		System.out.println(z + pi);


	}
}