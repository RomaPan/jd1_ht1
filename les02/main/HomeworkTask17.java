package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask17 {
//	  17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее
//	  геометрическое модулей этих чисел.
	public static void main(String[] args) {
		double firstNumber;
		double secondNumber;
		double arithmeticalMean;
		double logarithmicMean;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		firstNumber = scan.nextDouble();
		System.out.print("Please enter second number: ");
		secondNumber = scan.nextDouble();
		scan.close();
		
		arithmeticalMean = (Math.pow(firstNumber, 3) + Math.pow(secondNumber, 3)) / 2;
		System.out.println("Arithmetical mean of two numbers is: " + arithmeticalMean);
		
		logarithmicMean = Math.sqrt(firstNumber * secondNumber);
		System.out.println("Logarithmic mean of two numbers is: " + logarithmicMean);

	}

}
