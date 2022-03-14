package uoc.week_1;

/**
 * 
 *  Escribir una función para invertir manualmente un array pasado por parámetro.
 *  Es decir, dada la entrada {0,1,2,4,8} se modificaría esta como [8,4,2,1,0]. 
 *  Una posible solución es recorrer el array desde 0 hasta su mitad, 
 *  e ir intercambiando el primer elemento con el último, el segundo con el penúltimo y así sucesivamente.
 *  
 * @author epiaggio
 *
 */
public class Ex18 {
	
	public static void main(String[] args) {
		
		int array[]  = {0,1,2,4,8};
		
		invertirArray(array);
		for(int i: array) {
			System.out.println(i);
		}
	}

	private static int[] invertirArray(int[] array) {
		
		int aux = 0;
		
		for (int i = 0; i < array.length/2; i++) {
			aux = array[i]; 
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = aux;
		}
		
		return array;
	}

}