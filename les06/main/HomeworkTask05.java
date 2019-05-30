package by.htp.les06.main;

import java.util.Scanner;

public class HomeworkTask05 {
//	5. Ќаписать метод(методы) дл€ нахождени€ суммы большего и меньшего из трех чисел.
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
		
		System.out.println("Smallest number is : " + smallestNumber(a, b, c));
		System.out.println("Largest number is : " + largestNumber(a, b, c));
		System.out.println("Sum of largest and smalles numbers is: " + (smallestNumber(a, b, c)+largestNumber(a, b, c)));
		
		

	}

	public static int smallestNumber(int a, int b, int c) {
		int smallNum = 0;
		if (a < b && a < c ) {
			smallNum = a;
		} else if (b < a && b < c) {
			smallNum = b;
		} else if (c < a && c < b) {
			smallNum = c;
		}
		return smallNum;
	}
	
	public static int largestNumber(int a, int b, int c) {
		int largestNum = 0;
		if (a > b && a > c ) {
			largestNum = a;
		} else if (b > a && b > c) {
			largestNum = b;
		} else if (c > a && c > b) {
			largestNum = c;
		}
		return largestNum;
	}
}
