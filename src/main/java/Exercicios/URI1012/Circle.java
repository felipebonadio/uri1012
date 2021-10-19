package Exercicios.URI1012;

public class Circle extends Shape {
	final double PI = 3.14159;
	double raio;
	
	
	
	public Circle(double raio) {
		super();
		this.raio = raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getArea() {
		return PI * (Math.pow(raio, 2));
	}

	@Override
	public String toString() {
		return String.format("CIRCULO: %.3f", getArea());
	}
}
