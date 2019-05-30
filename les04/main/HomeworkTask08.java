package by.htp.les04.main;

import java.util.Scanner;

public class HomeworkTask08 {
//	8. Вычислить значения функции на отрезке [а,b] c шагом h:
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int h;
		int x;
		int y;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter values for A and B: ");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.print("Please enter value for step H: ");
		h = scan.nextInt();
		System.out.println("Please enter value for C: ");
		c = scan.nextInt();
		scan.close();
		
		x = a;
		
		while (x == 15 && x<b) {
			y = (x+c)*2;
			x = x + h;
			System.out.println(x + " " + y + " ");
		}
		while (x!=15 && x < b) {
			y = (x-c)+6;
			x = x + h;
			System.out.println(x + " " + y + " ");
		}
	}

}
