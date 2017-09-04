import static java.lang.System.*;

public class RandomNumbers2 {
	public static void main(String [] args) {
		int a, b, c, d, e, low, high;

		// plus 1 gives you a range of 1 through 10
		a = 1 + (int) (Math.random() * 10);
		b = 1 + (int) (Math.random() * 10);
		c = 1 + (int) (Math.random() * 10);
		d = 1 + (int) (Math.random() * 10);
		e = 1 + (int) (Math.random() * 10);

		out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + e);

		// 1 through 100
		a = 1 + (int) (Math.random() * 100);
		b = 1 + (int) (Math.random() * 100);
		c = 1 + (int) (Math.random() * 100);
		d = 1 + (int) (Math.random() * 100);
		e = 1 + (int) (Math.random() * 100);

		out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + e);

		// 70 through 100
		a = 70 + (int) (Math.random() * 31);
		b = 70 + (int) (Math.random() * 31);
		c = 70 + (int) (Math.random() * 31);
		d = 70 + (int) (Math.random() * 31);
		e = 70 + (int) (Math.random() * 31);

		out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + e);

		low = 70;
		high = 100;

		// [low, high]
		a = low + (int) (Math.random() * (high-low+1));
		b = low + (int) (Math.random() * (high-low+1));
		c = low + (int) (Math.random() * (high-low+1));
		d = low + (int) (Math.random() * (high-low+1));
		e = low + (int) (Math.random() * (high-low+1));

		out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + e);
	}
}