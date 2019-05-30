package by.htp.les06.main;

import java.util.Scanner;


public class HomeworkTask02 {
//	2. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего
//	общего кратного двух натуральных чисел: НОК(А,В) = НОД А(ВА,В)
	public static void main(String[] args) {
		
		int a;
		int b;

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter value for A and B: ");
		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();
		
		greatestCommonDivisor(a,b);
		System.out.println("The greatest common divisor is: " + greatestCommonDivisor(a,b));
		leastCommonMultiple(a, b, greatestCommonDivisor(a,b));
		System.out.println("The least common multiple is: " + leastCommonMultiple(a, b, greatestCommonDivisor(a,b)));
		
	}
	
	public static int greatestCommonDivisor(int a, int b) {
		int gcd = 0;

		for (int i = 1; i < a; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
	
	public static int leastCommonMultiple(int a, int b, int gcd) {
		int lcm = a * b / gcd;
		return lcm;
	}

}
