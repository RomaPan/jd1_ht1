package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask14 {
	// 14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R
	public static void main(String[] args) {
		double radius;
		double pi;
		
		double length;
		double area;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter radius value: ");
		radius = scan.nextDouble();
		scan.close();
		
		pi = Math.PI;
		length = 2 * pi * radius;
		
		System.out.printf("Сircumference value is: %.2f",length);
		System.out.println("");
		
		area = pi * radius * radius;
		
		System.out.printf("Area of the circle is: %.2f", area);	
		
	}

}
