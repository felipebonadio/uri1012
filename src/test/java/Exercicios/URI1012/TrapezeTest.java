package Exercicios.URI1012;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrapezeTest {

	@Test
	public void testTrapeze3And4And5Dot2() {
		Trapeze trap = new Trapeze(3, 4, 5.2);
		assertEquals(18.200, trap.getArea(), 0.001);
	}
	
	@Test
	public void testTrapeze12Dot7And10Dot4And15Dot2() {
		Trapeze trap = new Trapeze(12.7, 10.4, 15.2);
		assertEquals(175.560, trap.getArea(), 0.001);
	}

}
