import static java.lang.System.*;

class Address {
	String street, city, state;
	int zip;
}

public class MailingAddresses {
	public static void main(String [] args) {

		Address uno = new Address();
		
		uno.street = "191 Marigold Lane";
		uno.city = "Miami";
		uno.state = "FL";
		uno.zip = 33179;

		out.println(uno.street + "\n" + uno.city + ", " + uno.state + " " + uno.zip);
	}
}