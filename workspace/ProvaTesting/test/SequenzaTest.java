import static org.junit.Assert.*;

import org.junit.Test;

public class SequenzaTest {

	@Test
	public void test() {
		//TODO
	}
	
	public Sequenza sequenza(int... array) {
		Sequenza s = new Sequenza();
		for(int i = 0; i < array.length; i++) {
			s.setElemento(i, array[i]);
		}
		return s;
	}
	
	@Test
	public void testMassimo() {
		assertEquals(8, this.sequenza(1,2,3,4,5,6,7,8).massimo());
	}
}
