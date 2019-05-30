package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask15 {
	//15 Написать программу, которая выводит на экран первые четыре степени числа π.
	public static void main(String[] args) {
		double userNumber;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your number: ");
		userNumber = scan.nextDouble();
		scan.close();
		
		System.out.println(Math.pow(userNumber, 1) + " | " + Math.pow(userNumber,2)+ " | " + Math.pow(userNumber,3) + " | " + Math.pow(userNumber,4));
		
	}

}
