package Exercicios.URI1012;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testCircle5Dot2() {
		Circle cir = new Circle(5.2);		
		assertEquals(84.949, cir.getArea(), 0.001);
	}
	
	@Test
	public void testCircle15Dot2() {
		Circle cir = new Circle(15.2);		
		assertEquals(725.833, cir.getArea(), 0.001);
	}

}
