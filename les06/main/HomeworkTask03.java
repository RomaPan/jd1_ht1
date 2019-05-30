package by.htp.les06.main;

import java.util.Scanner;

public class HomeworkTask03 {
//	3. Написать метод(методы) для нахождения наибольшего общего делителя четырех
//	натуральных чисел.
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter numbers: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		scan.close();
		
		greatestCommonDivisor(a, b, c, d);
		System.out.println("Greatest common Divisor for given numbers is: " + greatestCommonDivisor(a, b, c, d));
		

	}
	
	public static int greatestCommonDivisor(int a, int b, int c, int d) {
		int gcd = 1;

		for (int i = 1; i < a; i++) {
			if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0 ) {
				gcd = i;
			}
		}
		return gcd;
	}

}
