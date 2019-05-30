package by.htp.les02.main;

import java.util.Scanner;



public class HomeworkTask08 {
	//8. Вычислить значение выражения по формуле (все переменные принимают
	//действительные значения): (( b + √(b² + 4ac) ) / 2a) - a³c + b⁻²
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		double f;
		
		System.out.println("Simple equation: f = (( b + √(b² + 4ac) ) / 2a) - a³c + b⁻² ");
		System.out.print("Please enter integer <a>: ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		System.out.print("Please enter integer <b>: ");
		b = scan.nextInt();
		System.out.print("Please enter integer <c>: ");
		c = scan.nextInt();
		scan.close();
		
		f = (( b + (Math.sqrt( b * b + 4 * a * c )) / ( 2 * a ) ) - (Math.pow(a, 3) * c + Math.pow(b, -2)));
		
		System.out.println("f = " + f);
	}

}
