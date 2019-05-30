package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask32 {
//	32. Ќаписать программу, котора€ по заданным трем числам определ€ет, €вл€етс€ ли сумма
//	каких-либо двух из них положительной.
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter 3 integer numbers: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		scan.close();
		
		if ( (a+b)>0 && (b+c)>0 || (a+b)>0 && (a+c)>0 || (b+c)>0 && (a+c)>0 ) {
			System.out.println("Sum of two numbers given is positive");
		} else {
			System.out.println("Sum is not positive");
		}
	}

}
