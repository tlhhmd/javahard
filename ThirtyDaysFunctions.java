import java.util.Scanner;
import static java.lang.System.*;

/**
 * Contains functions that make it easier to work with months.
 */
public class ThirtyDaysFunctions {
	public static void main (String[] args) {
		Scanner kb = new Scanner(in);

		out.print("Which month? (1-12) ");
		int month = kb.nextInt();

		out.println(monthDays(month) + " days hath " + monthName(month));
	}

	public static String monthName(int month) {

		if (month == 1)
			return "January";
		if (month == 2)
			return "February";
		if (month == 3)
			return "March";
		if (month == 4)
			return "April";
		if (month == 5)
			return "May";
		if (month == 6)
			return "June";
		if (month == 7)
			return "July";
		if (month == 8)
			return "August";
		if (month == 9)
			return "September";
		if (month == 10)
			return "October";
		if (month == 11)
			return "November";
		if (month == 12)
			return "December";

		else
			return "ERROR!";
	}

	/**
	* Returns the number of days in a given month.
	*
	* @author Talha Ahmad
	* @param month the month number (1-12)
	* @return the number of days in a non-leap year for that month
	*/
	public static int monthDays(int month) {
		int days;

		switch (month) {
			case 9:
			case 4:
			case 6:
			case 11: 	days = 30;
						break;

			case 2: 	days = 28;
						break;

			default: days = 31;
		}

		return days;
	}
}