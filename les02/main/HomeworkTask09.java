package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask09 {
	//9. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
  
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double f;
		
		System.out.println("Equation: f = ((a/c) * (b/d)) - ((a * b - c) / (c * d))");
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter <a>: ");
		a = scan.nextInt();
		System.out.print("Please enter <b>: ");
		b = scan.nextInt();
		System.out.print("Please enter <c>: ");
		c = scan.nextInt();
		System.out.print("Please enter <d>: ");
		d = scan.nextInt();
		scan.close();
		
		f = ((a/c) * (b/d)) - ((a * b - c) / (c * d));
		System.out.println("f = " + f);
		

	}

}
