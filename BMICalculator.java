import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi;

    System.out.print("Height (m)? ");
    m = keyboard.nextDouble();

    System.out.print("Weight (kg)? ");
    kg = keyboard.nextDouble();

    bmi = kg / (m * m);

    System.out.print("BMI: " + bmi);
  }
}
