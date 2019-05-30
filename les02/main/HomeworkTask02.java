package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask02 {
	//2. Найдите значение функции: с = 3 + а.
	public static void main(String[] args) {
		int a;
		int c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Simple equation (c = 3 + a)");
		System.out.print("Please enter an integer number for <a> : ");
		
		while(scan.hasNextInt() == false) {
			System.out.println("Entered value is not an integer number, please try again ");
			scan.next();
		}
		
		a = scan.nextInt();
		scan.close();
		
		c = 3 + a;
		System.out.println("c = " + c);
		

	}

}
