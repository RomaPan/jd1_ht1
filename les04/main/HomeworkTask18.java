package by.htp.les04.main;

import java.util.Scanner;

public class HomeworkTask18 {
//	18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых
//	больше или равен заданному е. Общий член ряда имеет вид: an = ((-1)*n-1) / n);
	public static void main(String[] args) {
		double an;
		double n;

		double sum;
		double e;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter value for E: ");
		e = scan.nextDouble();
		scan.close();
		
		n = 1;
		an = 1;
		sum = 1;
		
		while (Math.abs(sum) >= e) {
			an = (((-1)*(n-1))/n);
			n = n + 1;
			sum = sum + an;
			System.out.print(sum + " ");
		}
		
	}

}
