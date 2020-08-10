package fa.training.assignment1;

import java.util.Scanner;

public class ArithmeticExercise2 {

	public static void main(String[] args) {

		int a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input first number: ");
		a = scanner.nextInt();
		System.out.print("Input second number: ");
		b = scanner.nextInt();
		
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b));
		System.out.println(a + " % " + b + " = " + (a % b));
	}

}
