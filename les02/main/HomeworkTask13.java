package by.htp.les02.main;

import java.awt.Point;

import java.util.Scanner;

public class HomeworkTask13 {
	//13. Заданы координаты трех вершин треугольника (х1 у1),(х2, у2),(х3, у3). Найти его
	//периметр и площадь.
	public static void main(String[] args) {
		double x1;
		double y1;
		
		double x2;
		double y2;
		
		double x3;
		double y3;
		
		double sideA;
		double sideB;
		double sideC;
		
		double perimeter;
		double area;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter value for x1: ");
		x1 = scan.nextDouble();
		System.out.print("Please enter value for y1: ");
		y1 = scan.nextDouble();
		
		System.out.print("Please enter value for x2: ");
		x2 = scan.nextDouble();
		System.out.print("Please enter value for y2: ");
		y2 = scan.nextDouble();
		
		System.out.print("Please enter value for x3: ");
		x3 = scan.nextDouble();
		System.out.print("Please enter value for y3: ");
		y3 = scan.nextDouble();
		
		scan.close();
		
		area = Math.abs(( x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))/2); 
		
		System.out.println("Area of the triangle is: " + area);
		
		sideA = Point.distance(x1, y1, x2, y2);
		sideB = Point.distance(x2, y2, x3, y3);
		sideC = Point.distance(x1, y1, x3, y3);
		
		perimeter = sideA + sideB + sideC;
		
		System.out.print("Perimeter of the triangle is: ");
		System.out.printf("%.2f%n", perimeter);
		
	}

}
