package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask39 {
//	39. Вычислить значение функции:
	public static void main(String[] args) {
		int x;
		double f;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter value for x: ");
		x = scan.nextInt();
		scan.close();
		
		if ( x >= 8 ) {
			f = (-x)*(-x) + x - 9;
			System.out.println("f = (-x)*(-x) + x - 9 = " + f);
		} else {
			f = 1 / ((Math.pow(x, 4) - 6));
			System.out.println("f = 1 / ((Math.pow(x, 4) - 6)) = " + f);
		}

	}

}
