package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask39 {
//	39. ƒано действительное число х. Ќе пользу€сь никакими другими арифметическими
//	операци€ми, кроме умножени€, сложени€ и вычитани€, вычислите за минимальное число
//	операций: f = 2x^4 - 3х^3 + 4х^2 - 5х + 6;
	public static void main(String[] args) {
		double f;
		int x;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter value for x: ");
		x = scan.nextInt();
		scan.close();
		
		f = x*x*(2*x*x - 3*x + 4) - 5*x + 6;
		System.out.println(f);
	}

}
