package by.htp.les06.main;

import java.util.Scanner;

public class HomeworkTask12 {
//	12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
//	вычисления его площади, если угол между сторонами длиной X и Y— прямой
	public static void main(String[] args) {
		int x;
		int y;
		int z;
		int t;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter side values for regtangle X,Y,Z,T : ");
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		t = scan.nextInt();
		scan.close();
		
		//square
		if (x == y && x == z && x == t) {
			System.out.println("Area of the regtangle is: " + squareArea(x));
		}
		//regtangle with all 90 corners
		if (x == z && y == t && x!= y) {
			System.out.println("Area of the regtangle is: " + rightRegtangleArea(x, y));
		}
		//regtangle with 2 90 degrees corners
		if (x != y && x != z && x != t && y != z && y != t && z != t) {
			System.out.println("Area of the regtangle is: " + twoRightAnglesArea(x, y, z));
		}
	}
	
	public static int squareArea(int a) {
		int sqrArea = a*a;
		return sqrArea;
	}
	
	public static int rightRegtangleArea(int a, int b) {
		int regtangleArea = a * b;
		return regtangleArea;
		
	}
	
	public static double twoRightAnglesArea(int a, int b, int c) {
		double twoAnglesArea = 0.5*(a + b)*c;
		return twoAnglesArea;
	}

}
