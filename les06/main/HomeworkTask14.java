package by.htp.les06.main;

import java.util.Scanner;

public class HomeworkTask14 {
//	14. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр
	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter two numbers for comparison: ");
		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();
		
		System.out.println("The number with the most digits is: " + comparison(a, b));
		
		
		

		
		
	}
	public static int comparison(int a, int b) {
		int compare;
		if (a > b) {
			compare = a;
		} else {
			compare = b;
		}
		return compare;
	}
}
