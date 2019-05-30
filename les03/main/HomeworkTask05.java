package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask05 {
//	5. Составить программу: определения наименьшего из двух чисел а и b.
	public static void main(String[] args) {
		double a;
		double b;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers <a> and <b>: ");
		a = scan.nextDouble();
		b = scan.nextDouble();
		scan.close();
		
		if (a == b) {
			System.out.println("Given two numbers are equal");
		} else if (a < b) {
			System.out.println("<A> is smaller than <B>");
		} else {
			System.out.println("<B> is smaller than <A>");
		}

	}

}
