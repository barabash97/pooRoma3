import static org.junit.Assert.*;

import org.junit.Test;

public class OrdinatoreTest {

	@Test
	public void test() {
		
	}
	
	/**
	 * oggetto orario preimpostato
	 * @return
	 */
	public Orario oggettoOrario() {
		Orario o = new Orario(07, 00);
		return o;
	}
	
	public Orario[] listaOrariPreImpostati() {
		Orario[] orari = new Orario[3];
		orari[0] = new Orario(07,00);
		orari[1] = new Orario(10, 00);
		orari[2] = new Orario(06, 00);
		return orari;
	}
	
	@Test
	public void testOrdinaDueOggetti() {
		Orario[] orari = this.listaOrariPreImpostati();
		Ordinatore.ordina(orari);
		assertEquals(this.oggettoOrario().toString(), orari[1].toString());
	}
}
