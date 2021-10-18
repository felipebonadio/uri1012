package Exercicios.URI1012;

public class Triangle {
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
		return (base * height)/2;
		
	}
	

}
