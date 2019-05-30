package by.htp.les04.main;

import java.util.Scanner;

public class HomeworkTask17 {
//	17. ƒаны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
	public static void main(String[] args) {
		double a;
		double n; 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter value for A and N: ");
		a = scan.nextInt();
		n = scan.nextInt();
		scan.close();
		
		int i = 1;
		while (i <= n) {
			a = a * (a + 1);
			n = n - 1;
			System.out.print(a + " ");
		}

	}

}
