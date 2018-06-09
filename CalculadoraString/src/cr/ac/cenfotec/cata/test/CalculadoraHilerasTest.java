package cr.ac.cenfotec.cata.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cr.ac.cenfotec.cata.CalculadoraHileras;

public class CalculadoraHilerasTest {
	
	CalculadoraHileras calc = new CalculadoraHileras();
	
	@Test
	public void testStringVacio() throws Exception {
		assertEquals(0,calc.add(""));
	}
	
	@Test 
	public void testSumaSimple() throws Exception {
		assertEquals(1,calc.add("0,1"));
		assertEquals(3,calc.add("0,1,2"));
	}
	
	@Test(expected=Exception.class)
	public void testErrorNumeroParametros() throws Exception {
		assertEquals(4,calc.add("1,1,1,1"));
	}
	@Test
	public void testMultiplesValores() throws Exception {
		assertEquals(4,calc.add("1,1,1,1"));
	}

}
