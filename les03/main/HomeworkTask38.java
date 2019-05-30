package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask38 {
//	38. Вычислить значение функции:
	public static void main(String[] args) {
		int x;
		int f;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter value for x: ");
		x = scan.nextInt();
		scan.close();
		
		if ( x >= 0 && x <= 3 ) {
			f = x*x;
			System.out.println("f = " + f);
		} else {
			f = 4;
			System.out.println("f = " + f);
		}

	}

}
