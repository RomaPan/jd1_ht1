package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask18 {
//	18. Подсчитать количество отрицательных среди чисел а, b, с
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int x = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter A, B, C : ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		scan.close();
		
		if (a < 0) {
			x = x + 1;
		}
		if (b < 0) {
			x = x + 1;
		}
		if (c < 0) {
			x = x + 1;
		}
		System.out.println("The number of negative numbers entered: " + x);
	}

}
