import java.io.FileWriter;
import java.io.PrintWriter;

public class LetterRevisited {
	public static void main(String [] args) throws Exception {
		PrintWriter fileout = new PrintWriter(new FileWriter("letter.txt"));

		for (int i = 1; i < 501; i+=i)
			fileout.println("Yes! " + i);

		fileout.close();
	}
}