import java.util.Random;
public class Main {

	public static void main(String[] args) {
		GruppoDiForme gruppoForme = new GruppoDiForme();
		Random rand = new Random();
		int i;

		for (i = 0; i < gruppoForme.dimensioneArrayForme(); i++) {
			
			Punto p = new Punto(rand.nextInt(10), rand.nextInt(10));
			Forma singolaForma;
			int valoreRandom = rand.nextInt(2);
			
			switch(valoreRandom) {
			case 0:
				singolaForma = new Cerchio(p, rand.nextInt(100));
				break;
			case 1: 
				singolaForma = new Rettangolo(p, rand.nextInt(100), rand.nextInt(100));
				break;
				
			default:
				singolaForma = new Cerchio(p, rand.nextInt(100));
				break;
			}
			gruppoForme.aggiungiForma(i, singolaForma);
			
		}
		
		for (i = 0; i < gruppoForme.dimensioneArrayForme(); i++) {
			System.out.println(gruppoForme.getForma(i).toString());
		}
	}

}
