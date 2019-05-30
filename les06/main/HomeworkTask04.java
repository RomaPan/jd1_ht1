package by.htp.les06.main;

import java.util.Scanner;

public class HomeworkTask04 {
//	4. Написать метод(методы) для нахождения наименьшего общего кратного трех
//	натуральных чисел.
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter numbers: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		scan.close();
		
		System.out.println("Least Common Multiple of three numbers is : " + leastCommonMultiple(a, b, c, greatestCommonDivisor(a, b, c)));

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
	
	public static int leastCommonMultiple(int a, int b, int c, int gcd) {
		int lcm = a * b * c / gcd;
		return lcm;
	}

}
