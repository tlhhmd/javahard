import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
    String name;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("What's your name? ");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println("You're " + age + " years old. How much do you weigh? ");
    weight = keyboard.nextDouble();

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );
    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.println( name + "." );

    double soul;

    System.out.print("What's the answer to life, the universe, and all that? ");
    soul = keyboard.nextDouble();
    System.out.print(soul);
  }
}

/*
Study Drills
Does the program blow up if you enter an integer value when it is expecting you
to type a double? Put an answer in a comment at the bottom of the code, along
with your guess why or why not.

A: No. An integer is a double

Does the program blow up if you enter a numeric value (integer or double) when
it is expecting a String? Put an answer in a comment at the bottom of the code,
along with your guess why or why not.

A: No. Numbers can be parts of strings

Type something that makes the program blow up on every question possible, and
add comments explaining what blew it up and why.

name = couldn't figure one out
age = 2.5 / only expects whole numbers aka integers
double = letter of the alphabet / only expects digits, commas, periods.

Add a new variable of your choosing. Add another question.
(It doesn’t have to be rude.) Let the human put an answer to your question into
your new variable, and display the human’s answer on the screen afterward.
*/
