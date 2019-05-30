package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask37 {
//	37. Вычислить значение функции:
	public static void main(String[] args) {
		int x;
		double f;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter vaule for <x>: ");
		x = scan.nextInt();
		scan.close();
		
		if (x>=3) {
			f = (-x)*(-x)+3*(-x)+9;
			System.out.println(" f = (-x)*(-x)+3*(-x)+9 = " + f);
		} else if (x<3) {
			f = 1 / (Math.pow(x, 3) + 6);
			System.out.println(" f = 1 / (Math.pow(x, 3) - 6) = " + f);
		} 
	}

}
