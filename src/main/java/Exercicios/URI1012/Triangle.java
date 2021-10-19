package Exercicios.URI1012;

public class Triangle extends Shape{
	private double base;
	private double height;

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return (base * height) / 2;

	}

	@Override
	public String toString() {
		return String.format("TRIANGULO: %.3f", getArea());
	}

}
