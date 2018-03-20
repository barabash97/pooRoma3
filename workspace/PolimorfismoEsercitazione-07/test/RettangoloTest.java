import static org.junit.Assert.*;

import org.junit.Test;

public class RettangoloTest {

	@Test
	public void test() {
		
	}
	
	public Rettangolo oggetto() {
		Punto p = new Punto(0,0);
		Rettangolo r = new Rettangolo(p, 20,10);
		return r;
	}
	
	@Test
	public void testTrasla1() {
		assertEquals(1,1);
	}

}
