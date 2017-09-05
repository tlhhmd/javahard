import static java.lang.System.*;

public class FarmerBrown {
	public static void main(String [] args) {

		double budget = 100.00,
			sheepPrice = 10.0,
			goatPrice = 3.50, 
			chickenPrice = 0.50;
		
		int total = 100, count = 0;

		for (int s = 1; s <= total/sheepPrice; s++)
			for (int g = 1; g <= total/goatPrice; g++)
				for (int c = 1; c <= 100; c++) {
					count += 1;
					if (s + g + c == total && sheepPrice*s + goatPrice*g + chickenPrice*c == budget)
						out.println(s + " sheep, " + g + " goats, and " + c + " chickens.");
				}

		out.println("Count: " + count);
	}
}