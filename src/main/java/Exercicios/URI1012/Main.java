package Exercicios.URI1012;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();
		
		Triangle tri = new Triangle(a, c);
		Circle cir = new Circle(c);
		Trapeze trap = new Trapeze(a, b, c);
		Square squa = new Square(b, b);
		Rectangle req = new Rectangle(a, b);
		
		System.out.printf("TRIANGULO: %.3f%n", tri.getArea());
		System.out.printf("CIRCULO: %.3f%n", cir.getArea());
		System.out.printf("TRAPEZIO: %.3f%n", trap.getArea());
		System.out.printf("QUADRADO: %.3f%n", squa.getArea());
		System.out.printf("RETANGULO: %.3f%n", req.getArea());

	}

}
