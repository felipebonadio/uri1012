package Exercicios.URI1012;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void testMain() {
		Circle cir = new Circle(5.2);
		Rectangle rec = new Rectangle(3, 4);
		Square sqr = new Square(4,4);
		Trapeze trap = new Trapeze(3, 4, 5.2);
		Triangle tri = new Triangle(3, 5.2);
		assertEquals(84.949, cir.getArea(), 0.001);
		assertEquals(12.000, rec.getArea(), 0.001);
		assertEquals(16.000, sqr.getArea(), 0.001);
		assertEquals(18.200, trap.getArea(), 0.001);
		assertEquals(7.800, tri.getArea(), 0.001);
		
	}

}
