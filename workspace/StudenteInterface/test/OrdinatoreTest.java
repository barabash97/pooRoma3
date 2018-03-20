import static org.junit.Assert.*;

import org.junit.Test;

public class OrdinatoreTest {

	@Test
	public void test() {
		
	}
	
	public Studente oggettoConfronto() {
		Studente s = new Studente("Michele" , 24);
		
		return s;
	}
	
	public Studente[] listaOggetti() {
		Studente[] s;
		s = new Studente[2];
		s[0] = new Studente("Ivan", 20);
		s[1] = new Studente("Michele", 24);
		return s;
	}
	
	public void testOrdina() {
		Studente[] s = this.listaOggetti();
		Ordinatore.ordina(s);
		assertEquals(this.oggettoConfronto().toString(), s[0].toString());
	}

}
