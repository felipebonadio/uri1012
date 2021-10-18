package Exercicios.URI1012;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testTriangle3And5Dot2() {
		Triangle tri = new Triangle(3.0, 5.2);
		assertEquals(7.800, tri.getArea(), 0.001);
	}
	
	@Test
	public void testTriangle12Dot7And15Dot2() {
		Triangle tri = new Triangle(12.7, 15.2);
		assertEquals(96.520, tri.getArea(), 0.001);
	}

}
