package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask15 {
//	15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел
//	заменить половиной их суммы, а большее — их удвоенным произведением
	public static void main(String[] args) {
		int x;
		int y;
		int sum;
		int multiply;

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter first integer number <x> : ");
		x = scan.nextInt();
		System.out.print("Please enter second integer number <y> : ");
		y = scan.nextInt();
		scan.close();
		
		sum = x + y;
		multiply = x * y;
		
		if ( x < y ) {
			x = sum / 2;
			y = multiply * multiply;
			System.out.println(" <x> = " + x + ", <y> = " + y);
		} else if ( y < x) {
			y = sum / 2;
			x = multiply*multiply;
			System.out.println(" <x> = " + x + ", <y> = " + y);
		}
	}

}
