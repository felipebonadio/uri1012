package Exercicios.URI1012;

public class Rectangle extends Shape{

	private double sideA;
	private double sideB;

	public Rectangle(double sideA, double sideB) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getArea() {
		return sideA * sideB;
	}

	@Override
	public String toString() {
		return String.format("RETANGULO: %.3f", getArea());
	}

}
