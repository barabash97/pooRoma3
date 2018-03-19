import java.lang.reflect.Array;

public class Sequenza {
	
	private int[] array = new int[11];
	
	
	public static void main(String[] argv) {
		Sequenza s = new Sequenza();
		s.init();
		s.stampaArray();
		System.out.println("massimo: " + s.massimo());
	}
	/**
	 * Valore massimo dell'array
	 * @param array
	 * @return
	 */
	public int massimo() {
		int max = this.array[0];
		int i;
		for(i = 0; i < this.array.length; i++) {
			if(max < this.array[i]) {
				max = this.array[i];
			}
		}
		
		return max;
	}
	
	public void setElemento(int indice, int valore) {
		if(indice == this.array.length-1) {
			return;
		}
		this.array[indice] = valore;
	}
	
	public void init() {
		for(int i = 0; i < this.array.length; i++) {
			this.setElemento(i, i+1);
		}
	}
	
	public void stampaArray() {
		for(int i = 0; i < this.array.length; i++) {
			System.out.println("Indice: " + i + ", Valore: " + this.array[i]);
		}
	}
	
}
