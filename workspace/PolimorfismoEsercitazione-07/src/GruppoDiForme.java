
public class GruppoDiForme {
	private Forma[] forme;
	
	public GruppoDiForme() {
		this.forme = new Forma[100];
	}
	
	public Forma getForma(int indice) {
		return this.forme[indice];
	}
	
	public void aggiungiForma(int indice, Forma f) {
		this.forme[indice] = f;
	}
	
	public int dimensioneArrayForme() {
		return this.forme.length;
	}
}
