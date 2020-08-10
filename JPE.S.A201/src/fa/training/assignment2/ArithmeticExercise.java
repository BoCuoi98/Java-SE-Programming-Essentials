package fa.training.assignment2;

import java.util.Scanner;

public class ArithmeticExercise {

	public static void main(String[] args) {

		int a, b, c, d, e;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input first number: ");
		a = scanner.nextInt();
		System.out.print("Input second number: ");
		b = scanner.nextInt();
		System.out.print("Input third number: ");
		c = scanner.nextInt();
		System.out.print("Input fourth number: ");
		d = scanner.nextInt();
		System.out.print("Input fifth number: ");
		e = scanner.nextInt();
		
		System.out.println("The sum is " + (a + b + c + d + e));
	}

}
