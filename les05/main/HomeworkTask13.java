package by.htp.les05.main;

import java.util.Scanner;

public class HomeworkTask13 {
//	13. Определить количество элементов последовательности натуральных чисел, кратных
//	числу М и заключенных в промежутке от L до N.
	public static void main(String[] args) {
		int l;
		int n;
		int m;
		int counter = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the ascending sequence of numbers in a period ");
		System.out.print("Starting at L: ");
		l = scan.nextInt();
		System.out.println("Period ends at N: ");
		n = scan.nextInt();
		System.out.print("Please enter the number M: ");
		m = scan.nextInt();
		scan.close();
		
		for (int i = l; i < n; i++) {
			if (i % m == 0) {
				counter++;
			}
			
		}
		System.out.println("Quantity of elements in ascending number period from L to N and multiple to M: " + counter);

	}

}
