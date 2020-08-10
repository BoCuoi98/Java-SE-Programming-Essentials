package fa.training.assignment2;

import java.util.Scanner;

public class LogicalExercise {

	public static void main(String[] args) {

		int a, b, c, d;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input first number: ");
		a = scanner.nextInt();
		System.out.print("Input second number: ");
		b = scanner.nextInt();
		System.out.print("Input third number: ");
		c = scanner.nextInt();
		System.out.print("Input fourth number: ");
		d = scanner.nextInt();
		
		if ((a == b) && (a == c) && (a == d)) {
			System.out.println("Numbers are equal!");
		} else {
			System.out.println("Numbers are not equal!");
		}
	}

}
