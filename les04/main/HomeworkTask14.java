package by.htp.les04.main;

import java.util.Scanner;

public class HomeworkTask14 {
//	14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
	public static void main(String[] args) {
		double n;
		double sum = 0;
		double i = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter value for N: ");
		n = scan.nextInt();
		scan.close();
		
		sum = sum + 1;
		
		while (i <= n) {
			sum = sum + (1/n);
			i = i + 1;
		} System.out.println("sum of (1 + 1/2 + 1/3 + 1/4 + ... + 1/n) = " + sum + "  When N =" + n);

	}

}
