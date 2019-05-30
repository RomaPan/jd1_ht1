package by.htp.les06.main;

import java.util.Scanner;

public class HomeworkTask17 {
//	17. Натуральное число, в записи которого n цифр, называется числом Армстронга, если
//	сумма его цифр, возведенная в степень n, равна самому числу. Найти все числа
//	Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
	public static void main(String[] args) {
		int k;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the number K(100-999): ");
		k = scan.nextInt();
		scan.close();
		
		if (k > 100 && k < 999) {
			System.out.print(threeDigitNumber(k));
		}
		
	}
	
	public static String threeDigitNumber(int k) {
		String armNumber = "";
		int a;
		int b;
		int c;
		int sum;
		int i = 1;
		
		while (i < k) {
			a = i / 100;
			b = i / 10 % 10;
			c = i % 10;
			sum = (a*a*a) + (b*b*b) + (c*c*c);
			if (sum == k && i < k) {
				armNumber = armNumber + i + "   ";
				i++;
			} else {
				i++;
			}
		}
		if (armNumber == "") {
			System.out.println("The given number, is not an Armstrong number. Please try 370 or 371 or 576 or 407 as an example");
		} else {
			System.out.println("Your number IS an Armstrong number");
		}
		return armNumber;
	}

	
	
}
