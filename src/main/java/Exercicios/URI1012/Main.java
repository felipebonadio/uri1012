package Exercicios.URI1012;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();
		
		List<Shape> shapes = Arrays.asList(new Triangle(a, c), new Circle(c), new Trapeze(a, b, c), new Square(b, b),new Rectangle(a, b) );
		
//		for(Shape shape : shapes) {
//			System.out.println(shape);
//		}
		shapes.stream().forEach(System.out::println);
	}
}
