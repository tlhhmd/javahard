import static java.lang.System.*;
import java.util.Scanner;

public class HeronsFormula {
	public static double triangleArea(int a, int b, int c) {
		double p;

		p = (a + b + c) / 2.0;

		return Math.sqrt(p*(p - a)*(p - b)*(p-c));
	}

	public static void main(String [] args) {
		int a, b, c;
		Scanner keyboard = new Scanner(in);

		out.print("\nSide a of the triangle: ");
		a = keyboard.nextInt();

		out.print("Side b of the triangle: ");
		b = keyboard.nextInt();

		out.print("Side c of the triangle: ");
		c = keyboard.nextInt();

		out.println("\n\tA triangle of sides " + 
			a + ", " + 
			b + ", and " + 
			c + " has an area of: " + 
			triangleArea(a, b, c));

		for(int i = 1; i < 10; i+=2)
			out.println(i + ": " + triangleArea(i, i, i));		
	}
}