import java.math.*;
import java.util.Random;
public class MainStudent {

	public static void main(String[] args) {
		Studente singoloStudente = new Studente("Vladimir", 18);
		Studente[] studenti;
		studenti = new Studente[3];
		Random random = new Random();
		int i; 
		
		for(i = 0; i < studenti.length; i++) {
			studenti[i] = new Studente("Studente" + i, random.nextInt(70));
		}
		
		Ordinatore.ordina(studenti);
		
		for(i = 0; i < studenti.length; i++) {
			System.out.println(studenti[i].toString());
		}
	}

}
