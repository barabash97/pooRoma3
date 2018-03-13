import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author darkness
 *
 */
public class ProvaArrayTest {

	@Test
	public void test() {
		
	}
	
	@Test
	public void testArrayCrescente() {
		ProvaArray prova = new ProvaArray();
		int[] arrayProva1 = {1,2,3,4,5,6,7,8};
		assertEquals(true, prova.isCrescente(arrayProva1));
	}
	
	@Test
	public void testArrayCrescenteDue() {
		ProvaArray prova = new ProvaArray();
		int[] arrayProva1 = {1,2,3,4,5,6,7,8};
		assertEquals(true, prova.isCrescente(arrayProva1));
	}

}
