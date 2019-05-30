package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask03 {
	//3. Ќайдите значение функции: z = 2 * x + ( y Ц 2 ) * 5.
	public static void main(String[] args) {
		int x;
		int y;
		int z;
		
		System.out.println("Simple equation  z = 2 * x + ( y Ц 2 ) * 5");
		System.out.print("Please enter <x> integer number: ");
		Scanner scan = new Scanner(System.in);
		
		while (!scan.hasNextInt()) {
			System.out.println("Entered value is not an integer number, please try again ");
			scan.next();
		}
		
		x = scan.nextInt();
		
		System.out.print("Please enter <y> integer number: ");
		
		while (!scan.hasNextInt()) {
			System.out.println("Entered value is not an integer number, please try again ");
			scan.next();
		}
		
		y = scan.nextInt();
		scan.close();
		
		z = 2 * x + ( y - 2 ) * 5;
		System.out.println("z = " + z);
		
	}

}
