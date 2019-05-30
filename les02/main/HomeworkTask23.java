package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask23 {
//	23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r)
	public static void main(String[] args) {
		double r;
		double R;

		double ringArea;
		double pi;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter inner radius of a ring: ");
		r = scan.nextDouble();
		System.out.print("Enter outer radius of a ring: ");
		R = scan.nextDouble();
		scan.close();
		
		pi = Math.PI;
		
		ringArea = (pi * Math.pow(R, 2)) - (pi * Math.pow(r, 2));
		System.out.printf("Ring area is: %.2f %n", ringArea);

	}

}
