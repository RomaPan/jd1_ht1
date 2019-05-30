package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask19 {
// 19. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его
//	высоту, радиусы вписанной и описанной окружностей.
	public static void main(String[] args) {
		double triangleSide;
		double area;
		double height;
		
		double innerRadius;
		double outerRadius;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter value for a side of an equilateral triangle: ");
		triangleSide = scan.nextDouble();
		scan.close();
		
		height = ( Math.sqrt(3) / 2 ) * triangleSide;
		System.out.println("Triangle height is: " + height);
		
		area = ( Math.sqrt(3) / 4 ) * Math.pow(triangleSide, 2);
		System.out.println("Triangle area is: " + area);
		
		innerRadius = ( Math.sqrt(3) / 6 ) * triangleSide;
		System.out.println("Inner radius is: " + innerRadius);
		
		outerRadius = (Math.sqrt(3) / 3 ) * triangleSide;
		System.out.println("Outer radius is: " + outerRadius);
		
	}

}
