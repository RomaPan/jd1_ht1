package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask20 {
// 20. »звестна длина окружности. Ќайти площадь круга, ограниченного этой окружностью.
	public static void main(String[] args) {
		double length;
		double area;
		double pi;
		double radius;
			
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the circumference lengh: ");
		length = scan.nextDouble();
		scan.close();
		
		pi = Math.PI;

		radius = length / (2 * pi);
		
		area = pi * Math.pow(radius, 2);
		System.out.println("Area of the circle is: " + area);
	}

}
