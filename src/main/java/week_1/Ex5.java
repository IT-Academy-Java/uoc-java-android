package week_1;

import java.util.Scanner;

/**
 * Haz una función que dados 2 números, nos indique si el primero es mayor que el segundo.
 *
 * @author epiaggio
 */
public class Ex5 {

  public static void main(String[] args) {
    int num1 = getNumberFromScanner();
    int num2 = getNumberFromScanner();
    System.out.println("The biggest is =>" + getTheBiggest(num1, num2));
  }

  private static int getNumberFromScanner() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Number: \t");
    int number = scanner.nextInt();
    return number;
  }

  private static int getTheBiggest(int num1, int num2) {
    if (num1 > num2) {
      return num1;
    }
    return num2;
  }
}
