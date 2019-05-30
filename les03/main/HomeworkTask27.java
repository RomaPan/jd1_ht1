package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask27 {
//	27. Найти max{min(a, b), min(c, d)}
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int max;
		int min1;
		int min2;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter values for A, B, C, D: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		scan.close();
		
		if (a > b) {
			min1 = b;
		} else {
			min1 = a;
		}
		if (c > d) {
			min2 = d;
		} else {
			min2 = c;
		}
		if (min1 > min2) {
			max = min1;
		} else {
			max = min2;
		}
		System.out.println("max{min(a, b), min(c, d)} = max " + max);

	}

}
