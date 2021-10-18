package Exercicios.URI1012;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void testSquare4() {
		Square sqr = new Square(4, 4);
		assertEquals(16.000, sqr.getArea(), 0.001);
	}

	@Test
	public void testSquare10Dot4() {
		Square sqr = new Square(10.4, 10.4);
		assertEquals(108.160, sqr.getArea(), 0.001);
	}
}
