package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask31 {
//	31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить,
//	пройдет ли кирпич через отверстие.
	public static void main(String[] args) {
		int a;
		int b;
		
		int x;
		int y;
		int z;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter dimensions for an opening A, B : ");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.print("Please enter dimensions of a brick X,Y,Z : ");
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		scan.close();
	//			AB XY				AB YZ			AB ZX				AB XZ			 AB YX			  AB ZY
		if (a >= x && b >= y || a >= y && b >= z || a >= z && b >= x || a >= x && b >= z || a >= y && b >= x || a >= z && b >= y) {
			 System.out.println("The brick will pass through the AB opening");
		} else {
			System.out.println("The brick will not pass through the AB opening");
		}

	}

}
