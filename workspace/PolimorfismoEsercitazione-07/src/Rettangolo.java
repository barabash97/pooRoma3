public class Rettangolo implements Forma {
	private int altezza, base, larghezza;
	private Punto vertice;

	public Rettangolo(Punto vertice, int altezza, int base) {
		this.altezza = altezza;
		this.larghezza = base;
		this.vertice = new Punto(vertice.getX(), vertice.getY());
	}

	public void trasla(int deltaX, int deltaY) {
		this.vertice.setX(this.vertice.getX() + deltaX);
		this.vertice.setY(this.vertice.getY() + deltaY);
	}

	public Punto getVertice() {
		return this.vertice;
	}

	public int getBase() {
		return this.base;
	}

	public int getAltezza() {
		return this.altezza;
	}

	public int getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(int larghezza) {
		this.larghezza = larghezza;
	}
	
	public String toString() {
		String stringa = new String();
		stringa += "############  Rettangolo  ##########\n\n";
		stringa += "Base: " + this.getBase() + "\n";
		stringa += "Altezza: " + this.getAltezza() + "\n";
		stringa += "Vertice: " + this.getVertice().toString() + "\n";
		stringa += "######################\n\n";
		return stringa;
	}

}