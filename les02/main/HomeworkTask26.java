package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask26 {
//26. Ќайти площадь треугольника, две стороны которого равны а и b, а угол между этими
//	сторонами у.
	public static void main(String[] args) {
		double a;
		double b;
		double y;
		double s;

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter value for side a, side b, angle y : ");
		a = scan.nextDouble();
		b = scan.nextDouble();
		y = scan.nextDouble();
		scan.close();
		
		s = 0.5 * a * b *(Math.sin(y));
		System.out.printf("Area of the triangle is: S = %.2f%n", s);
			
	}

}
