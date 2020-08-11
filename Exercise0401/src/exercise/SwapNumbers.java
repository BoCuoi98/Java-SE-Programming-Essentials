package exercise;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		SwapNumbers swapNumbers = new SwapNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number 1: ");
		// Nhập vào từ bàn phím 1 chuỗi, sau đó chuyển sang kiểu dữ liệu Integer và gán vào cho biến num1
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.print("Input number 2: ");
		// Nhập vào từ bàn phím 1 chuỗi, sau đó chuyển sang kiểu dữ liệu Integer và gán vào cho biến num2
		int num2 = Integer.parseInt(scanner.nextLine());
		System.out.println("Before swap: num1 = " + num1 + ", num2 = " + num2);
		swapNumbers.swap(num1, num2);
		System.out.println("After swap: num1 = " + num1 + ", num2 = " + num2);
	}

	public void swap(int num1, int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("In swap: num1 = " + num1 + ", num2 = " + num2);
	}
}
