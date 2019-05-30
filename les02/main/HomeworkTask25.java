package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask25 {
//	25. Вычислить корни квадратного уравнения ах2 + bх + с = 0 с заданными коэффициентами
//	a, b и с (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double x1;
		double x2;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a b c: ");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		scan.close();
		
		d = (Math.sqrt(b)) - (4 * a * c);
		
		if (d < 0) {
			System.out.print("There is no root in this equation");
		} else if (d > 0) {
			x1 = (-b + Math.sqrt(d)) / (2 * a);
			x2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("Roots of the equation are: x1= " + x1 + " x2= " + x2);
		} else if (d == 0){
			x1 = (-b) / (2 * a);
			System.out.println("The root of the equation is: x1= " + x1);
		}
	}
}
