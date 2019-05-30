package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask11 {
//	11. Составить программу, которая определит площадь какого треугольника больше
	public static void main(String[] args) {
		double s1;
		double s2;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter value for area of triangle 1: ");
		s1 = scan.nextDouble();
		System.out.print("Please enter value for area of triangle 2: ");
		s2 = scan.nextDouble();
		
		scan.close();
		
		if ( s1 > s2 ) {
			System.out.println("Area of triangle 1 is bigger than area of triangle 2");
		} else if ( s2 > s1 ) {
			System.out.println("Area of triangle 2 is bigger than area of triangle 1");
		} else {
			System.out.println("Area of triangle 1 is equal to the area of triangle 2");
		}

	}

}
