package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask16 {
//	16. На плоскости ХОY задана своими координатами точка А. Указать, где она расположена
//	(на какой оси или в каком координатном угле)
	public static void main(String[] args) {
		int x;
		int y;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter coordinates X,Y for point A: ");
		x = scan.nextInt();
		y = scan.nextInt();
		scan.close();
		
		if (x > 0 && y == 0 || x < 0 && y == 0 ) {
			System.out.println("Point A lays on X axes.");
			
		} else if(y > 0 && x == 0 || y < 0 && x == 0 ) {
			System.out.println("Point A lays on Y axes");
		} else if (x > 0 && y > 0) {
			System.out.println("Point A lays in X+Y+ area of coordinate matrix");
		} else if (x > 0 && y < 0) {
			System.out.println("Point A lays in X+Y- area of coordinate matrix");
		} else if (x < 0 && y < 0) {
			System.out.println("Point A lays in X-Y- area of coordinate matrix");
		} else if (x < 0 && y > 0) {
			System.out.println("Point A lays in X-Y+ area of coordinate matrix");
		} else {
			System.out.println("Point A located at the center of coordinate matrix");
		}

	}

}
