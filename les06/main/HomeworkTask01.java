package by.htp.les06.main;

import java.util.Scanner;

public class HomeworkTask01 {
//	1. Треугольник задан координатами своих вершин. Написать метод для вычисления его
//	площади
	public static void main(String[] args) {
		int aX;
		int aY;
		int bX;
		int bY;
		int cX;
		int cY;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter x,y value for point A: ");
		aX = scan.nextInt();
		aY = scan.nextInt();
		System.out.print("Please enter x,y value for point B: ");
		bX = scan.nextInt();
		bY = scan.nextInt();
		System.out.print("Please enter x,y value for point C: ");
		cX = scan.nextInt();
		cY = scan.nextInt();
		scan.close();

//		triangleArea(aX,aY,bX,bY,cX,cY);
		printArea(triangleArea(aX,aY,bX,bY,cX,cY));
		}

	
	
	
	public static double triangleArea (int aX, int aY, int bX, int bY, int cX, int cY) {
		double area = Math.abs((aX*(bY - cY) + bX*(cY - aY) + cX*(aY-bY))/ 2);
		return area;
	}
	
	
	
	public static void printArea(double s) {
		System.out.println("Triangle area is: " + s);
	} 

}
