package fa.training.assignment1;

import java.util.Scanner;

public class RectangleExercise {

	public static void main(String[] args) {

		double a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Width = ");
		a = scanner.nextDouble();
		System.out.print("Height = ");
		b = scanner.nextDouble();
		
		System.out.println("Area is " + a + " * " + b + " = " + (a * b));
		System.out.println("Perimeter is 2 * (" + a + " + " + b + ") = " + (2 * (a + b)));
	}

}
