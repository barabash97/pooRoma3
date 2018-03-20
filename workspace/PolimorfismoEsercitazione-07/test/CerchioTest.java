import static org.junit.Assert.*;

import org.junit.Test;

public class CerchioTest {

	@Test
	public void test() {
		
	}
	
	public Cerchio oggettoIstanziato() {
		Punto p  = new Punto(0,0);
		Cerchio c = new Cerchio(p, 1);
		
		return c;
	}
	
	public Cerchio oggettoTraslato(Cerchio c, int x, int y) {
		c.trasla(x, y);
		return c;
	}
	
	@Test 
	public void testTraslaSenzaTraslazione() {
		Cerchio c1 = this.oggettoIstanziato();
		Cerchio c2 = this.oggettoIstanziato();
		c2.trasla(0, 0);
		assertEquals(c1.getCentro(), c2.getCentro());
	}
	
	@Test
	public void testTraslaConTraslazione() {
		Cerchio c1 = this.oggettoIstanziato();
		Cerchio c2 = this.oggettoIstanziato();
		c2.trasla(0, 1);
		assertNotEquals(c1.getCentro(), c2.getCentro());
	}
}
