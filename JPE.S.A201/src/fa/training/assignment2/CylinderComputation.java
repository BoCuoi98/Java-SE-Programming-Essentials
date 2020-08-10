package fa.training.assignment2;

import java.util.Scanner;

public class CylinderComputation {

	public static void main(String[] args) {

		double R, h;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Radius = ");
		R = scanner.nextDouble();
		System.out.print("Height = ");
		h = scanner.nextDouble();
		
		System.out.println("Surface area = " + (2 * Math.PI * R * (R + h)));
		System.out.println("Base area = " + (Math.PI * Math.pow(R, 2)));
		System.out.println("Volume = " + (Math.PI * Math.pow(R, 2) * h));
	}

}
