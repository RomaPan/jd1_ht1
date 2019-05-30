package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask07 {
//	7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных
//	значениях a, b, c и х
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int x;
		int f;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a, b, c, x values: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		x = scan.nextInt();
		scan.close();
		
		if ( x >= 0 ) {
			f = a*x*x + b*x + c;
			System.out.println("result of the equation is: " + f);
		} else {
			System.out.println("This equation can not be solved, because module x < 0 ");
		}
		
		

	}

}
