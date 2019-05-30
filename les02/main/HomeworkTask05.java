package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask05 {
	//5. Составить алгоритм нахождения среднего арифметического двух чисел
	public static void main(String[] args) {
		double firstNumber;
		double secondNumber;
		double arithmeticMean;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the first number: ");
		
		while (!scan.hasNextDouble()) {
			System.out.println("Please enter a valid number");
			scan.next();
		}
		firstNumber = scan.nextDouble();
		
System.out.print("Please enter the second number: ");
		
		while (!scan.hasNextDouble()) {
			System.out.println("Please enter a valid number");
			scan.next();
		}
		secondNumber = scan.nextDouble();
		scan.close();
		
		arithmeticMean = ( firstNumber + secondNumber ) / 2;
		
		System.out.println(" Arithmetic mean of two numbers is: " + arithmeticMean);
		
	}

}
