package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask12 {
//	12. Даны три действительных числа. Возвести в квадрат те из них, значения которых
//	неотрицательны, и в четвертую степень — отрицательные
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter value for numbers: A, B & C: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		scan.close();
		
		if ( a > 0 ) {
			a = a*a;
		} else {
			a = Math.pow(a, 4);
		}
		
		if ( b > 0 ) {
			b = b*b;
		} else {
			b = Math.pow(b, 4);
		}
		
		if ( c > 0 ) {
			c = c*c;
		} else {
			c = Math.pow(c, 4);
		}
		System.out.println("A = " + a + " B = " + b + " C = " + c);
	}

}
