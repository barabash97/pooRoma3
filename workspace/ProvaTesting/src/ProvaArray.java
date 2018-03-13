
public class ProvaArray {
	
	public static void main(String[] argv) {
		int[] arrayProva1 = {1,2,3,4,5,6,7,8};
		ProvaArray prova = new ProvaArray();
		System.out.println("Valore: " + prova.isCrescente(arrayProva1));
	}
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public boolean isCrescente(int array[]) {
		int valore = array[0];
		for(int i = 1; i < array.length - 1; i++) {
			if(valore > array[i]) {
				return false;
			}
			valore = array[i];
		}
		return true;
	}
	
	
}
