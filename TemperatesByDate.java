import java.util.Scanner;
import static java.lang.System.*;

class TemperatureSample {
	int month, day, year;
	double temperature;
}

public class TemperatesByDate {
	public static void main(String [] args) throws Exception {
		String url = "http://learnjavathehardway.org/txt/avg-daily-temps-with-dates-atx.txt";

		Scanner inFile = new Scanner((new java.net.URL(url)).openStream());

		TemperatureSample[] tempDB = new TemperatureSample[10000];
		int numRecords, i = 0;

		while (inFile.hasNextInt() && i < tempDB.length) {
			TemperatureSample e = new TemperatureSample();

			e.month = inFile.nextInt();
			e.day = inFile.nextInt();
			e.year = inFile.nextInt();
			e.temperature = inFile.nextDouble();

			// continue means skip the rest of the body of the loop and go to the next
			// iteration
			if (e.temperature == -99)
				continue;

			tempDB[i] = e;
			i++;
		}

		inFile.close();
		numRecords = i;

		out.println(numRecords + " daily temperatures loaded.");

		double total = 0, avg;
		int count = 0;

		for (i = 0; i < numRecords; i++)
			if (tempDB[i].month == 11) {
				total += tempDB[i].temperature;
				count++;
			}

		avg = total / count;
		avg = roundToOneDecimal(avg);

		out.println("Average daily temp over " + count + " days November: " + avg);
	}

	public static double roundToOneDecimal(double d) {
		return Math.round(d*10)/10.0;
	}
}