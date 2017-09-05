import static java.lang.System.*;

public class ArraySlotAccess {
	public static void main(String [] args) {
		int [] arr = new int[1000];
		int i;

		arr[0] = 0;
		arr[1] = 0;
		arr[2] = 0;

		out.println("Array contains: " + arr);

		arr[0] = 1 + (int) (Math.random() * 100);
		arr[1] = 1 + (int) (Math.random() * 100);
		arr[2] = 1 + (int) (Math.random() * 100);

		out.println("Array contains: " + arr[0] + " " + arr[1] + " " + arr[2]);

		for (i = 0; i < arr.length; i++)
			arr[i] = 1 + (int) (Math.random() * 100);

		for (i = 0; i < arr.length; i++)
			out.print(arr[i] + "\t");

		out.println();
	}
}