package by.htp.les04.main;

import java.util.Scanner;

public class HomeworkTask20 {
//	20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых
//	больше или равен заданному е. Общий член ряда имеет вид: a_n = 1 /((3*n-2)*(3*n+1)); 
	public static void main(String[] args) {
		double e;
		double an;
		int n;
		double sum;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter E value: ");
		e = scan.nextDouble();
		scan.close();
		
		n = 1;
		sum = 0;
		an = Math.abs(1.0 /((3*n-2)*(3*n+1)));
		System.out.println(an);

		while (Math.abs(sum) <= e) {
			an = Math.abs(1.0 /((3*n-2)*(3*n+1)));
			sum = sum + an;
			n = n + 1;
			System.out.println(sum);
		}
	}

}
