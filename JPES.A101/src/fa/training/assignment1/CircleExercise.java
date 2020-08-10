package fa.training.assignment1;

import java.util.Scanner;

public class CircleExercise {

	public static void main(String[] args) {

		double R;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Radius = ");
		R = scanner.nextDouble();
		System.out.println("Perimeter is = " + (2 * Math.PI * R));
		System.out.println("Area is = " + (Math.PI * Math.pow(R, 2)));
	}

}
