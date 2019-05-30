package by.htp.les06.main;

import java.util.Scanner;

public class HomeworkTask09 {
//	9. Написать метод(методы), проверяющий, являются ли данные три числа взаимно
//	простыми.
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the 3 numbers here: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		scan.close();
		
		d = greatestCommonDivisor(a, b, c);
		if (d == 1) {
			System.out.println("Given three numbers are not relatively prime integers because gcd(a,b,c) = 1");
		} else {
			System.out.println("Given three numbers are relatively prime integers, their greatest common divisor is = " + d);
		}

	}
	
	public static int greatestCommonDivisor(int a, int b, int c) {
		int gcd = 1;

		for (int i = 1; i < a; i++) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
	

}
