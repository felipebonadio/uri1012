package Exercicios.URI1012;

public class Square extends Shape{
	private double sideA;
	private double sideB;
	
	public Square(double sideA, double sideB) {
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
		return sideA*sideB;
	}
	@Override
	public String toString() {
		return String.format("QUADRADO: %.3f",getArea());
	}
	

}
