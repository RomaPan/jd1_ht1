package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask04 {
//	4. Составить программу: равны ли два числа а и b?
	public static void main(String[] args) {
		double a;
		double b;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter number for < a > : ");
		a = scan.nextDouble();
		System.out.print("Please enter number for < b > : ");
		b = scan.nextDouble();
		scan.close();
		
		if (a == b) {
			System.out.println("Given two numbers are equal!");
			
		} else {
			System.out.println("Given two numbers are uneven!");
		}
		

	}

}
