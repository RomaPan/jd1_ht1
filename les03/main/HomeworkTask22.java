package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask22 {
//	22. Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих
//	значений, а в y - меньшее.
	public static void main(String[] args) {
		double x;
		double y;
		double temp1;
		double temp2;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter value for X and Y: ");
		x = scan.nextDouble();
		y = scan.nextDouble();
		scan.close();
		
		if (y > x) {
			temp1 = y;
			temp2 = x;
			x = temp1;
			y = temp2;
			System.out.println("X = " + x + " Y = " + y);
			
		} else {
			System.out.println("No change of placement happened.");
		}

	}

}
