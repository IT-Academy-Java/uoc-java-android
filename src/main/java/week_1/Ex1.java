package week_1;

import java.util.Scanner;

/**
 * Escribe una función que dado un valor entero de entrada, retorna true si este valor es un número par
 * 
 * @author epiaggio
 *
 */

public class Ex1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escribe un número entero: \b");
		int numero = scanner.nextInt();
		
		if(esPar(numero)) {
			System.out.println("El número es PAR" );
		}
		else {
			System.out.println("El número es IMPAR" );
		}
	}
	
	public static boolean esPar(int number) {
		if(number % 2 == 0) {
			return true;
		}
		return false;
	}

}