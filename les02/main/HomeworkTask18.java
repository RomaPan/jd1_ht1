package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask18 {
// 18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем
//	этого куба.
	public static void main(String[] args) {
		double edgeLength;
		double edgeArea;
		double fullCubeArea;
		double volume;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter edge length: ");
		edgeLength = scan.nextDouble();
		scan.close();
		
		edgeArea = edgeLength * edgeLength;
		System.out.println("Area of one edge of a cube is: " + edgeArea);
		
		fullCubeArea = 6 * (edgeLength * edgeLength);
		System.out.println("Full cube area is: " + fullCubeArea);
		
		volume = Math.pow(edgeLength, 3);
		System.out.println("Volume of a cube is: " + volume);
	
	}

}
