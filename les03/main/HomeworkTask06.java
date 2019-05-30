package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask06 {
//	6. Составить программу: определения наибольшего из двух чисел а и b
	public static void main(String[] args) {
		double a;
		double b;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter two numbers <a> and <b>: ");
		a = scan.nextDouble();
		b = scan.nextDouble();
		scan.close();
		
		if (a == b) {
			System.out.println("Given two numbers are equal");
		} else if (a > b) {
			System.out.println("<A> is bigger than <B>");
		} else {
			System.out.println("<B> is bigger than <A>");
		}

	}

}
