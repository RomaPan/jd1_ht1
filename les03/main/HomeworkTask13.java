package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask13 {
//	13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из
//	точек находится ближе к началу координат.
	public static void main(String[] args) {
		int x1;
		int x2;
		int y1;
		int y2;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter coordinates for point A (x1,y1): ");
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		System.out.print("Please enter coordinates for point B (x2,y2): ");
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		scan.close();
		// x1+, y1+, x2+, y2+ ---- x1 < x2, y1 < y2
		if ((x1 >= 0 && y1 >= 0) && (x2 >= 0 && y2 >= 0) && (x1 < x2 && y1 < y2)) {
			System.out.println("Point A is closer to the begining of the coordinates.");
		// x1+, x2+, x2+, y2+ ---- x2 < x1, y2 < y1	
		} else if (( x2 < x1 && y2 < y1) && ( x2 >= 0 && y2 >= 0 ) && ( x1 >= 0 && y1 >= 0 )) {
			System.out.println("Point B is closer to the begining of the coordinates.");
		} else if (( x1 <= 0 && x2 <= 0 ) && ( x1 < x2 && y1 < y2)) {
		// x1 == x2, y1 == y2	
		} else if ( x1 == x2 && y1 == y2) {
			System.out.println("Point A and B lay in the same distance to the begining of the coordinates.");
		}
			// Programm is NOT finished, missing negative coordinate sets of equations!!!!
		}
		
	}


