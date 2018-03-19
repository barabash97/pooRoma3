
public class Chitarra implements Strumento {
	
	/**
	 * array corde
	 */
	public int[] corde;
	
	/**
	 * Costruttore
	 */
	public Chitarra() {
		this.corde = new int[6];
	}
	
	@Override
	public void produciSuono() {
		System.out.println("dlen-dlen-dlen");
	}
	
	/**
	 * 
	 * @param corda
	 * @param valore
	 * @return
	 */
	public int accorda(int corda, int valore) {
		return this.corde[corda] += valore;
	}

}
