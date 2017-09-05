import static java.lang.System.*;
import java.net.URL;
import java.util.Scanner;

public class LowestTemperature {
	public static void main(String [] args) throws Exception {
		double[] temps = arrayFromUrl("http://learnjavathehardway.org/txt/avg-daily-temps-atx.txt");

		out.println(temps.length + " temps in the database.");

		double lowest = 9999.99;
		double highest = -9999.99;

		for (int i = 0; i < temps.length; i++)

			if (temps[i] < lowest)
				lowest = temps[i];
			
			else if (temps[i] > highest)
				highest = temps[i];

		out.println("The lowest average daily temp was " + lowest + "F (" + fToC(lowest) + "C)");
		out.println("The highest average daily temp was " + highest + "F (" + fToC(highest) + "C)");
	}

	public static double[] arrayFromUrl(String url) throws Exception {
		Scanner fin = new Scanner((new URL(url)).openStream());
		int count = fin.nextInt();
		double[] dubs = new double[count];

		for (int i = 0 ; i < dubs.length; i++)
			dubs[i] = fin.nextDouble();

		fin.close();

		return dubs;
	}

	public static double fToC(double f) {
		return (f-32)*5/9;
	}
}