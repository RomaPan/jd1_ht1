package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask24 {
//	24. Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем
//	основании а.
	public static void main(String[] args) {
		double sideA;
		double sideB;
//		double angleA;
		double area;
//		double height;
//		double pi = Math.PI;
		
		double sideC;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value for bigger side A: ");
		sideA = scan.nextDouble();
		System.out.print("Enter value for side B: ");
		sideB = scan.nextDouble();
//		System.out.print("Enter value of an angle(<90) at the base of the trapezium: ");
//		angleA = scan.nextDouble();
		scan.close();
		
		sideC = (sideA + sideB) / 2;
		
//		angleA = angleA * pi / 180;
		
//		height = ((sideA - sideB) * Math.sin(angleA)) / ( 2 * Math.cos(angleA));
		
		area = ((sideA + sideB)/2) * Math.sqrt(sideC * sideC - (Math.pow(sideA - sideB, 2) / 4 ));
//		area = (sideA + sideB) * height / 2;
		System.out.println("Area of the trapezium is: " + area);
	}

}
