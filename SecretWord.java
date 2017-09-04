import java.util.Scanner;

public class SecretWord {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String secret = "please", guess;

		System.out.print("What's the secret word? ");
		guess = keyboard.next();

		if (guess == secret)
			System.out.println("Impossible. (This will never be printed.)");

		else
			System.out.println("Nope, the secret word is not \"" + guess + ".\"");

	}
}

/*
Anyway, the if statement on line 14 will never be true. Never ever. No matter what you type in, it will 
never be the case that guess == secret.

	(I can’t really explain why without going into way too much detail, but it has to do 
	with the fact that == only compares the shallow values of the variables, and the 
	shallow values of two Strings are only equal when they refer to the same memory 
	location.)

What does work is using the .equals() method (which compares the deep values of the variables 
instead of their shallow values). This will be true if they type the correct secret word.
*/