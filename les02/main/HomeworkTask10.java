package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask10 {
	// 10. Вычислить значение выражения по формуле (все переменные принимают
	// действительные значения): (sin_x + cos_y) / ((cos_x - sin_y) * tg_xy)
	public static void main(String[] args) {
		
		double x;
		double y;
		double f;
		
		System.out.println("Equation f = (sin_x + cos_y) / ((cos_x - sin_y) * tg_xy)");
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter <x> value: ");
		x = scan.nextDouble();
		System.out.print("Please enter <y> value: ");
		y = scan.nextDouble();
		scan.close();
		
		f = ((( Math.sin(x) + Math.cos(y) ) / ((Math.cos(x) - Math.sin(y))) * Math.tan(x * y)));
		
		System.out.println("\n f = " + f);
	}

}
