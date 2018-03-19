import java.math.*;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Orario[] o = new Orario[10];
		Ordinatore ordinaObj = new Ordinatore();
		int i;
		Random r = new Random();
		for(i = 0; i < o.length; i++) {
			o[i] = new Orario(r.nextInt(12), r.nextInt(60));
		}
		
		Ordinatore.ordina(o);
		for(i = 0; i < o.length; i++) {
			System.out.println(o[i].toString());
		}
		
		//System.out.println(o.toString());
	}

}
