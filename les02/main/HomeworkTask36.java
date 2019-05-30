package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask36 {
//	36. Найти частное произведений четных и нечетных цифр четырехзначного числа
	public static void main(String[] args) {
		//дано четырехзначное число  5456
		int userNumber;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		
		int oddDigitsMultiply = 1;
		int evenDigitsMultiply = 1;
		double division;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter 4 digits integer number: ");
		userNumber = scan.nextInt();
		scan.close();
		
		firstDigit = userNumber / 1000;
		System.out.println(firstDigit);
		if (firstDigit % 2 == 0) {
			evenDigitsMultiply = evenDigitsMultiply * firstDigit;
		} else {
			oddDigitsMultiply = oddDigitsMultiply * firstDigit;
		}
//		System.out.println("n1 = " + firstDigit);
		
		secondDigit = (userNumber / 100) % 10;
		if (secondDigit % 2 == 0) {
			evenDigitsMultiply = evenDigitsMultiply * secondDigit;
		} else {
			oddDigitsMultiply = oddDigitsMultiply * secondDigit;
		}
//		System.out.println("n2 = " + secondDigit);
		
		thirdDigit = (userNumber / 10) % 10;
		if (thirdDigit % 2 == 0) {
			evenDigitsMultiply = evenDigitsMultiply * thirdDigit;
		} else {
			oddDigitsMultiply = oddDigitsMultiply * thirdDigit;
		}
//		System.out.println("n3 = " + thirdDigit);
		
		fourthDigit = userNumber % 10;
		if (fourthDigit % 2 == 0) {
			evenDigitsMultiply = evenDigitsMultiply * fourthDigit;
		} else {
			oddDigitsMultiply = oddDigitsMultiply * fourthDigit;
		}
//		System.out.println("n4 = " + fourthDigit);
		
		division = (double)evenDigitsMultiply / oddDigitsMultiply;
		System.out.println("Odd digits multiplication result = " + oddDigitsMultiply);
		System.out.println("Even digits multiplication result = " + evenDigitsMultiply);
		
		System.out.println("Division of two multiplication result is = " + division);
	}

}
