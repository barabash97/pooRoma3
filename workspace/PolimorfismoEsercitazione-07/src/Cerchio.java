public class Cerchio implements Forma {
	private int raggio;
	private Punto centro;

	public Cerchio(Punto centro, int raggio) {
		this.raggio = raggio;
		this.centro = new Punto(centro.getX(), centro.getY());
	}

	public void trasla(int deltaX, int deltaY) {
		this.centro.setX(this.centro.getX() + deltaX);
		this.centro.setY(this.centro.getY() + deltaY);
	}

	public Punto getCentro() {
		return this.centro;
	}

	public int getRaggio() {
		return this.raggio;
	}
	
	public String toString() {
		String stringa = new String();
		stringa += "############  Cerchio  ##########\n\n";
		stringa += ("Raggio: " + this.getRaggio() + "\n");
		stringa += (this.getCentro().toString() + "\n");
		stringa += "######################\n\n";
		return stringa;
	}
}