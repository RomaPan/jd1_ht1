package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask01 {
//	1. —оставить программу сравнени€ двух чисел 1 и 2. ≈сли 1 меньше 2 Ц вывести на экран
//	цифру 7, в противном случае Ц цифру 8
	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a and b numbers: ");
		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();
		
		if (a<b) {
			System.out.println("7");
		} else {
			System.out.println("8");
		}
	}

}
