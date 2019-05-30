package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask27 {
//	27. Дано значение a. Не используя никаких функций и никаких операций, кроме
//	умножения, получить значение а8 за три операции и а10 за четыре операции
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter value for <a>: ");
		a = scan.nextDouble();
		scan.close();
		
		b = (a * a * a) * (a * a * a) *(a * a);
		c = (a * a * a) * (a * a * a) * (a * a * a) * a;
		
		System.out.println("a^8 = " + b);
		System.out.println("a^8d = " + c);

	}

}
