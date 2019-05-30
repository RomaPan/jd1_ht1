package by.htp.les04.main;

import java.util.Scanner;

public class HomeworkTask19 {
//	19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых
//	больше или равен заданному е. Общий член ряда имеет вид:   an = 1/2^n + 1/3^n;
	public static void main(String[] args) {
		double an;
		double e;
		double n;
		double sum;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter E: ");
		e = scan.nextDouble();
		scan.close();
		
		
		n = 1;
		sum = 0;
//		an = 1/Math.pow(2, n) + 1/Math.pow(3, n);
//		System.out.println(an);
//		
//		for (int i = 0; i<= e; i++) {
//			an = 1/Math.pow(2, n) + 1/Math.pow(3, n);
//			n++;
//			sum = sum + an;
//			System.out.println(sum);
//		}
		
		while (sum <= e) {
			an = 1/Math.pow(2, n) + 1/Math.pow(3, n);
			n++;
			sum = sum + an;
			System.out.println(sum);
		}
		
		
		

	}

}
