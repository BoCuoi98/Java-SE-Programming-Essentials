package fa.training.assignment1;

import java.util.Scanner;

public class LogicalExercise {

	public static void main(String[] args) {

		int a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input first integer: ");
		a = scanner.nextInt();
		System.out.print("Input second integer: ");
		b = scanner.nextInt();
		
		if (a == b) {
			System.out.println(a + " = " + b);
			System.out.println(a + " <= " + b);
			System.out.println(a + " >= " + b);
		} else {
			System.out.println(a + " != " + b);
			if (a < b) {
				System.out.println(a + " < " + b);
				System.out.println(a + " <= " + b);
			} else {
				System.out.println(a + " > " + b);
				System.out.println(a + " >= " + b);
			}
		}
	}

}
