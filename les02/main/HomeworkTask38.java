package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask38 {
//	38. Для данных областей составить линейную программу, которая печатает true, если точка
//	с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
	public static void main(String[] args) {
		int x;
		int y;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter point coordinates x : ");
		x = scan.nextInt();
		System.out.print("Please enter point coordinates y: ");
		y = scan.nextInt();
		scan.close();
		
		// a)
		if ((x >= -4 && x <=4) && (y>=0 && y <=4 )) {
			if ((x == -4 && y == 1) || (x ==-3 && y == 2) || (x ==-2 && y == 3) || (x==-1 && y == 4)) {
				System.out.println("false for area A");	 
			} else {
				System.out.println("true for area A");
			}
		}else {
			System.out.println("false for area A");
		}
		
		//b)
		if (((x<=2 && x>=0) && (y>=0 && y<= 4)) || ((x<=4 && x>= 0) && (y>=-3 && y<=0)) || ((x>=-4 && x<=0)&&(y<=0 && y>=-3)) || ((x>=-4 && x<=0)&& (y>=0 && y<= 4))) {
			System.out.println("true for area B");
			
		}else {
			System.out.println("false for area B");
		}
	}

}
