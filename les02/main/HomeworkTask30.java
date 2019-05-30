package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask30 {
// 30. “ри сопротивлени€ R1 R2, и R3 соединены параллельно. Ќайдите сопротивление соединени€
	public static void main(String[] args) {
		double r1;
	    double r2;
		double r3;
		double mainR;

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter R1, R2, R3 : ");
		r1 = scan.nextDouble();
		r2 = scan.nextDouble();
		r3 = scan.nextDouble();
		scan.close();
		
		mainR = 1/(1/r1 + 1/r2 + 1/r3);
		System.out.println("Overall resistance is: " + mainR);
	}

}
