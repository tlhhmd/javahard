import static java.lang.System.*;

public class RandomNumbers {
	public static void main(String[] args) {
		int a, b, c;
		double x, y, z;

		// Math.random() produces a random double in range [0, 1]
		x = Math.random();
		y = Math.random();
		z = Math.random();

		out.println("x is " + x);
		out.println("y is " + y);
		out.println("z is " + z);

		x = Math.random() * 100;
		y = Math.random() * 100;
		z = Math.random() * 100;

		out.println ("\nx is " + x);
		out.println ("y is " + y);
		out.println ("z is " + z);

		// Converts x, y, z to an integer
		a = (int)x;
		b = (int)y;
		c = (int)z;

		out.println ("\na is " + a);
		out.println ("b is " + b);
		out.println ("c is " + c);

		x = 0.9999999999999999;
		a = (int)(x * 100);

		x = Math.random();
		a = 0 + (int)(x * 10);
		b = 1 + (int)(x * 10);
		c = 5 + (int)(x * 10);

		out.println ("\na is " + a);
		out.println ("b is " + b);
		out.println ("c is " + c);
	}
}