package by.htp.les04.main;

import java.util.Scanner;

public class HomeworkTask07 {
//	7. Вычислить значения функции на отрезке [а,b] c шагом h:
	public static void main(String[] args) {
		int a;
		int b;
		int h;
		int x;
		int y;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter A and B values: ");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.print("Please enter value for step H: ");
		h = scan.nextInt();
		scan.close();
		
		x = a;
		
		while (x>2 && x<b) {
			y = x;
			x = x + h;
			System.out.println(x + " " + y + " ");
		}
		while (x<=2 && x < b) {
			y = -x;
			x = x + h;
			System.out.println(x + " " + y + " ");
		}
		
		

	}

}
