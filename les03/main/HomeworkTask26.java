package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask26 {
//	26. Написать программу нахождения суммы большего и меньшего из трех чисел.
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int sum;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter values for A, B, C: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		scan.close();
		
		if (a > b && a > c && b > c) {
			sum = a + c;
			System.out.println("Sum of A + C = " + sum);
		} else if (a > b && a > c && c > b) {
			sum = a + b;
			System.out.println("Sum of A + B = " + sum);
		} else if (b > a && b > c && a > c) {
			sum = b + c;
			System.out.println("Sum of B + C = " + sum);
		} else if (b > a && c > a && b > c) {
			sum = b + a;
			System.out.println("Sume of B + A = " + sum);
		} else if (c > a && c > b && b > a) {
			sum = c + a;
			System.out.println("Sum of C + A = " + sum);
		} else if (c > b && c > a && a > b) {
			sum = c + b;
			System.out.println("Sum of C + B = " + sum);
		} else {
			System.out.println("Some of the numbers are equal :( ");
		}

	}

}
