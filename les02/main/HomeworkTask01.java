package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask01 {
	//1. Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.
	public static void main(String[] args) {
		int firstNumber = 0;
		int secondNumber = 0;
		int sum = 0;
		int subtraction = 0;
		int multiply = 0;
		double division = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter first integer number: ");
		
		while (scan.hasNextInt() == false) {
			System.out.println("Entered value is not an integer number, please try again ");
			scan.next();
			}
		firstNumber = scan.nextInt();
		
		System.out.print("Please enter second integer number: ");
		
		while (scan.hasNextInt() == false) {
			System.out.println("Entered value is not an integer number, please try again ");
			scan.next();
		}
		secondNumber = scan.nextInt();

		scan.close();
		
		sum = firstNumber + secondNumber;
		System.out.println("Sum of two numbers is: " + sum);
		
		subtraction = firstNumber - secondNumber;
		System.out.println("Subtraction of two numbers is: " + subtraction);
		
		multiply = firstNumber * secondNumber;
		System.out.println("Multiplication of two numbers is: " + multiply);
		
		division = (double)firstNumber/secondNumber;
		System.out.println("Division of two numbers is: " + division);
	}

}
