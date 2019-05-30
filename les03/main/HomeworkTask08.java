package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask08 {
//	8. Составить программу нахождения наименьшего из квадратов двух чисел а и b
	public static void main(String[] args) {
		double a;
		double b;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter values for A and for B: ");
		a = scan.nextDouble();
		b = scan.nextDouble();
		scan.close();
		
		a = Math.pow(a, 2);
		b = Math.pow(b, 2);
		
		
		if (a > b) {
			System.out.println("B is the smallest number");
		} else if (b > a) {
			System.out.println("A is the smallest number");
		} else {
			System.out.println("A is equal to B");
		}

	}

}
