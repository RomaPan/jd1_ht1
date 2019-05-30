package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask10 {
//	10. Составить программу, которая определит площадь какого круга меньше.
	public static void main(String[] args) {
		double s1;
		double s2;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter area value for circle 1: ");
		s1 = scan.nextDouble();
		System.out.print("Please enter area vaule for circle 2: ");
		s2 = scan.nextDouble();
		
		scan.close();
		
		if ( s1 > s2 ) {
			System.out.println("Area value of circle 1 is bigger than area value of circle 2");
		} else if ( s2 > s1 ) {
			System.out.println("Area value of circle 2 is bigger than area value of circle 1");
			
		} else {
			System.out.println("Area of circle 1 is equal to area value of circle 2");
		}

	}

}
