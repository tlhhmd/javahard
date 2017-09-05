import java.util.Scanner;
import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;

import static java.lang.System.*;

public class PasswordDigest {
	public static void main (String [] args) throws Exception {
		Scanner keyboard = new Scanner(in);

		String pw, hash;

		MessageDigest digest = MessageDigest.getInstance("SHA-256");

		out.print("Password: ");
		pw = keyboard.nextLine();

		digest.update(pw.getBytes("UTF-8"));
		hash = DatatypeConverter.printHexBinary(digest.digest());

		out.println(hash);
	}
}