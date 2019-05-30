package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask12 {
	//12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
	public static void main(String[] args) {
		
		double x1;
		double y1;
		
		double x2;
		double y2;
		
		double distanceBetweenTwoPoints;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter value for x1: ");
		x1 = scan.nextDouble();
		System.out.print("Please enter value for y1: ");
		y1 = scan.nextDouble();
		
		System.out.print("Please enter value for x2: ");
		x2 = scan.nextDouble();
		System.out.print("Please enter value for y2: ");
		y2 = scan.nextDouble();
		scan.close();
		
		distanceBetweenTwoPoints = Math.sqrt( (y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		System.out.println("Distance between two points is : " + distanceBetweenTwoPoints);
		
	}

}
