package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask20 {
//	20. ќпределить, делителем каких чисел а, b, с €вл€етс€ число k.
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double k;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter values for A, B, C and K: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		k = scan.nextDouble();
		scan.close();
		
		if (a % k != 0 && b % k != 0 && c % k != 0) {
			System.out.println("None of the numbers.");
			}
		if (a % k == 0) {
			System.out.println("K number is a divider of A");
		}
		if (b % k == 0) {
			System.out.println("K number is a divider of B");
		}
		if (c % k == 0) {
			System.out.println("K number is a divider of C");
		}
		}
		
}


