import java.util.Scanner;

public class Sequencing {
  public static void main( String[] args ) {

    Scanner keyboard = new Scanner(System.in);
    double price, salesTax, total;

    System.out.print( "How much is the purchase price? " );
    price = keyboard.nextDouble();

    salesTax = price * 0.0825;
    total = price + salesTax;

    /* Variables hold values, not formulas. The value of salesTax will not
    update automatically if the value of price changes */

    System.out.println( "Item price:\t" + price );
    System.out.println( "Sales tax:\t" + salesTax );
    System.out.println( "Total cost:\t" + total );
  }
}
