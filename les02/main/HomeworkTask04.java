package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask04 {
	//4. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
	public static void main (String [] args) {
		double a;
		double b;
		double c;
		
		double z;
		
		System.out.print("Please enter <a> number: ");
		Scanner scan = new Scanner(System.in);
		
		while (!scan.hasNextDouble()) {
			System.out.println("Entered value is not a number, please try again ");
			scan.next();
		}
		a = scan.nextDouble();
		
		System.out.print("Please enter <b> number: ");
		
		while (!scan.hasNextDouble()) {
			System.out.println("Entered value is not a number, please try again ");
			scan.next();
		}
		b = scan.nextDouble();
		
		System.out.print("Please enter <c> number: ");
		
		while (!scan.hasNextDouble()) {
			System.out.println("Entered value is not a number, please try again ");
			scan.next();
		}
		c = scan.nextDouble();
		scan.close();
		
		
		z = ( ( a - 3 ) * b / 2 ) + c;
		
		System.out.println("z = " + z);
	}
}
