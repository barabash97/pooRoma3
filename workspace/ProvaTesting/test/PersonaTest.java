import static org.junit.Assert.*;

import org.junit.Test;

public class PersonaTest {

	@Test
	public void test() {
		
	}
	
	public Persona persona(String... nomi) {
		Persona p = new Persona(nomi.length);
		int i;
		
		for(i = 0; i < nomi.length; i++) {
			p.aggiungiNome(i, nomi[i]);
		}
		
		return p;
	}
	
	@Test
	public void testOnonimiNessunUguale() {
		assertEquals(0, this.persona("Vladimir", "Michele", "Anton").contaOmonimiDi("Nessuno"));
	}
	
	@Test
	public void testOnonimiUnoUguale() {
		assertEquals(1, this.persona("Vladimir", "Michele", "Anton").contaOmonimiDi("Anton"));
	}
	
	

}
