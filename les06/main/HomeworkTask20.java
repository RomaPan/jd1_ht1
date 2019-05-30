package by.htp.les06.main;

import java.util.Scanner;

public class HomeworkTask20 {
//	20. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр
//	и т.д. Сколько таких действий надо произвести, чтобы получился нуль? Для решения
//	задачи использовать декомпозицию
	public static void main(String[] args) {
		int n;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter number N in range <9999: ");
		n = scan.nextInt();
		scan.close();
		
		System.out.println("\nSubtraction sequence happened "+subtractSum(n)+ " times.");

	}
		public static int subtractSum(int n) {
			int counter = 0;
			int a;
			int b;
			int c;
			int d;
			int sum;
			
			while (n>0) {
				a = n / 100 % 10;
				b = n / 10 % 10;
				c = n % 10;
				d = n / 1000;
				sum = a+b+c+d;
				System.out.println(n + " - " + sum);
				n = n - sum;
				counter++;
				
			}
			return counter;
		}
}
