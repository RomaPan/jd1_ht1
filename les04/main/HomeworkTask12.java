package by.htp.les04.main;

import java.util.Scanner;

public class HomeworkTask12 {
//	12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте
//	программу нахождения произведения первых 10 членов этой последовательности.
	public static void main(String[] args) {
		int n;

		int multiplication;
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter value for N: ");
		n = scan.nextInt();
		scan.close();
		
		while ( n > 1 ) {
			multiplication = (6+(n-1))* (6+(n-1));
			System.out.println(multiplication);
			n = n - 1;
		}

	}

}
