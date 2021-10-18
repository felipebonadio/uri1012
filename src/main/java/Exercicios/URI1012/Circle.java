package Exercicios.URI1012;

public class Circle {
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
}
