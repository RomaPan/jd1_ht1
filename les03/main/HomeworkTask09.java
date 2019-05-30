package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask09 {
//	9. Составить программу, которая определит по трем введенным сторонам, является ли
//	данный треугольник равносторонним.
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter value for each side of the triangle: ");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		scan.close();
		
		if (a == b && a  == c && c == b) {
			System.out.println("This trianlge is Equilateral");
		} else {
			System.out.println("This trianlge is not equilateral");
		}
	}

}
