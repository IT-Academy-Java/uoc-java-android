package week_1;

import java.util.Scanner;

/**
 * Crea una función que recibe los tres parámetros siguientes:
 * 2 números y
 * uno de los siguientes valores “+”, “-”, “*”, “/”, “%”, “pot”
 * y devuelva el resultado de la operación realizada.
 */
public class Ex3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Number 1: \n");
    int num1 = sc.nextInt();

    System.out.println("Number 2: \b");
    int num2 = sc.nextInt();

    System.out.println("Operator: \b");
    String operator = sc.next();

    System.out.println("Result: " + operationResult(num1,num2,operator));
    System.out.println("Chau");

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
