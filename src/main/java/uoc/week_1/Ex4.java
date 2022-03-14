package uoc.week_1;

import java.util.Scanner;

/**
 * Escribe una función que reciba tres números por parámetros y devuelva el mayor.
 *
 * @author epiaggio
 */
public class Ex4 {

  public static void main(String[] args) {
    System.out.println("The biggest: " + getThreeNumbersFromScanner());
  }

  private static int getThreeNumbersFromScanner(){
    Scanner sc = new Scanner(System.in);

    System.out.print("Number 1: \t");
    int num1 = sc.nextInt();

    System.out.print("Number 2: \t");
    int num2 = sc.nextInt();

    System.out.print("Number 3: \t");
    int num3 = sc.nextInt();

    return giveTheBiggestNumber(num1, num2, num3);
  }

  public static int giveTheBiggestNumber(int num1, int num2, int num3){
    if(num1 > num2 && num1 > num3){
      return num1;
    }
    if(num2 > num1 && num2 > num3){
      return num2;
    }
    return num3;
  }

}
