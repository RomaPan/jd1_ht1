package by.htp.les04.main;

import java.util.Scanner;

public class HomeworkTask06 {
//	6. Напишите программу, где пользователь вводит любое целое положительное число. А
//	программа суммирует все числа от 1 до введенного пользователем числа.
	public static void main(String[] args) {
		int num;
		int i = 1;
		int sum = 0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter integer number: ");
		num = scan.nextInt();
		scan.close();
		
		while (i <= num) {
			sum = sum + i;
			i++;
			System.out.println(" " + sum);
		}

	}

}
