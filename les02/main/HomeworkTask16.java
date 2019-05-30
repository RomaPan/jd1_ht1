package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask16 {
	//16. Найти произведение цифр заданного четырехзначного числа.
	public static void main(String[] args) {
		int userNumber;
		int multiplication = 1;
//		int fourthDigit;
//		int thirdDigit;
//		int secondDigit;
//		int firstDigit;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter four digit number: ");
		userNumber = scan.nextInt();
		scan.close();
		
		//#2 optimised method of method #1:
		while (userNumber > 0) {
			multiplication = multiplication * (userNumber % 10);
			userNumber = userNumber / 10;
		}
		System.out.println("Multiplication of 4 digits of a given number is: " + multiplication);
		
//		#1 My original thought process method below		
		
//		fourthDigit = userNumber % 10;
//		userNumber = userNumber / 10;
//		System.out.println("fourth digit is: " + fourthDigit);
//		System.out.println(userNumber);
			
//		thirdDigit = userNumber % 10;
//		userNumber = userNumber / 10;
//		System.out.println("third digit is: " + thirdDigit);
//		System.out.println(userNumber);
//		
//		secondDigit = userNumber % 10;
//		userNumber = userNumber / 10;
//		System.out.println("second digit is: " + secondDigit);
//		System.out.println(userNumber);
//		
//		firstDigit = userNumber % 10;
//		userNumber = userNumber / 10;
//		System.out.println("first digit is: " + firstDigit);
//		System.out.println(userNumber);
//		
//		multiplication = firstDigit * secondDigit * thirdDigit * fourthDigit;
//		
	}

}
