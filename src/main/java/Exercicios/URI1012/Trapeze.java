package Exercicios.URI1012;

public class Trapeze extends Shape {
	private double baseA;
	private double baseB;
	private double height;
	
	
	
	public Trapeze(double baseA, double baseB, double height) {
		super();
		this.baseA = baseA;
		this.baseB = baseB;
		this.height = height;
	}

	public void setBaseA(double baseA) {
		this.baseA = baseA;
	}
	
	public void setBaseB(double baseB) {
		this.baseB = baseB;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return String.format("TRAPEZIO: %.3f", getArea());
	}

	public double getArea() {
		return ((baseA + baseB) * height)/2;
	}
	

}
