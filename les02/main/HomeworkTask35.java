package by.htp.les02.main;

import java.util.Scanner;


public class HomeworkTask35 {
//	35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую
//	цифру целой части числа M/N
	public static void main (String [] args) {
		double m;
		double n;	
		int fullNumber;
		int fractionNumber;	
		double division;
		int temp1;
		int temp2;
		int shortestDigit = 9;
		int longestDigit = 0;	
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter <M> number: ");
		m = scan.nextDouble();
		System.out.print("Please enter <N> number: ");
		n = scan.nextDouble();
		scan.close();
		
		division = m / n;
		System.out.printf("Result of < M / N > = %.4f%n",division);
		
		fullNumber = (int)( m / n );
		//System.out.println("Full integer part number: " + fullNumber);
		
		fractionNumber = (int)((division - fullNumber) * 10000);
		//System.out.println("Fraction part number: " + fractionNumber);	
		
		if (fullNumber == 0) {
			System.out.println("Shortest digit of the Integer part of the number is: " + fullNumber);
		} else {
			while (fullNumber > 0) {
				temp1 = fullNumber % 10;
				fullNumber = fullNumber / 10;
				//System.out.print(temp1 + " ");
					if (temp1 < shortestDigit) {
						shortestDigit = temp1;
					} 		
		}
			System.out.println("Shortest digit in the integer part of the number is: " + shortestDigit);
		}
		if (fractionNumber == 9) {
			System.out.println("Longest digit of the fraction part of the number is: " + fractionNumber);
		} else {
			while (fractionNumber > 0 ) {
				temp2 = fractionNumber % 10;
				fractionNumber = fractionNumber / 10;
				//System.out.println(temp2 + " ");
				if (temp2 >= longestDigit) {
					longestDigit = temp2;
				}
			}
			System.out.println("Longest digit in the fraction part of the number is: " + longestDigit);
		}
	}
}



