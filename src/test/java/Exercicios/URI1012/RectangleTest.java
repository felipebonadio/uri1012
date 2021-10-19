package Exercicios.URI1012;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testRectangle3And4() {
		Rectangle rec = new Rectangle(3, 4);
		assertEquals(12.000, rec.getArea(), 0.001);
	}
	
	@Test
	public void testRectangle12Dot7And10Dot4() {
		Rectangle rec = new Rectangle(12.7, 10.4);
		assertEquals(132.080, rec.getArea(), 0.001);
	}
}
