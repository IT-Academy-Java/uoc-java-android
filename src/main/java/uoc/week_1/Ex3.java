package uoc.week_1;

import java.util.Scanner;

/**
 * Crea una función que recibe los tres parámetros siguientes:
 * 2 números y
 * uno de los siguientes valores “+”, “-”, “*”, “/”, “%”, “pot”
 * y devuelva el resultado de la operación realizada.
 *
 * @author epiaggio
 *
 */
public class Ex3 {

  public static void main(String[] args) {
    getFromScanner();
  }

  private static void getFromScanner(){
    Scanner sc = new Scanner(System.in);

    System.out.print("Number 1: \t");
    int num1 = sc.nextInt();

    System.out.print("Number 2: \t");
    int num2 = sc.nextInt();

    System.out.print("Operator: \t");
    String operator = sc.next();

    System.out.println("\n********************* Result: " + operationResult(num1,num2,operator) + " *********************");
  }

  private static float operationResult(float num1, float num2, String operator){
    float result = 0;

    switch (operator){
      case "+":
        result = num1 + num2;
        break;

      case "-":
        result = num1 - num2;
        break;

      case "*":
        result = num1 * num2;
        break;

      case "/":
        result = num1 / num2;
        break;

      case "%":
        result = num1 % num2;
        break;
    }

    return result;
  }
}
