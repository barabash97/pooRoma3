package primaLezione;

public class AttrezzoTest {

	public static void main(String[] args) {
		Attrezzo cacciavite = new Attrezzo("cacciavite", 20);
		Attrezzo scudo = new Attrezzo("scudo", 30);
		System.out.println("Il peso totale è: " + (cacciavite.getPeso() + scudo.getPeso()));

		if (cacciavite.getPeso() > scudo.getPeso()) {
			stampaMaggiore(cacciavite);
		} else if (scudo.getPeso() > cacciavite.getPeso()) {
			stampaMaggiore(scudo);
		} else {
			System.out.println("Entrambi attrezzi sono uguali");
		}
	}

	public static void stampaMaggiore(Attrezzo a) {
		System.out.println(a.getNome() + " ha peso maggiore");
	}

}
