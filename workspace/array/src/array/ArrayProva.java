package array;
/**
 * ArrayProva: commento della classe
 * @author darkness
 *
 */
public class ArrayProva {

	/**
	 * @author darkness
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = new int[10];
		int[] b = {11,12,13,14,15,16,17,18,19,20,34,241,51};
		int i;

		for (i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		
		stampaArrayForeach(a);
		System.out.println("#######################################");
		stampaArray(b);
	}

	/**
	 * Stampa array con metodo foreach
	 * @author darkness
	 * @param array
	 */
	public static void stampaArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Indice: " + i + ", Valore: " + array[i]);
		}
	}
	
	/**
	 * Stampa array con metodo foreach
	 * @author darkness
	 * @param array
	 */
	public static void stampaArrayForeach(int array[]) {
		for(int elemento : array) {
			System.out.println("Valore: " + elemento);
		}
	}
}
