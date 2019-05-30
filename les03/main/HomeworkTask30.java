package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask30 {
//	30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их
//	абсолютными значениями, если это не так
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter values for A, B, C : ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		scan.close();
		
		if (a > b && a > c && b > c) {
			a = a * a;
			b = b * b;
			c = c * c;
			System.out.println(" A = " + a + " B = " + b + " C = " + c);
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
			System.out.println(" A = " + a + " B = " + b + " C = " + c);
		}

	}

}
