package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask07 {
	//7. Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника
	public static void main(String[] args) {
		double rectangleWidth;
		double rectangleHeight;
		double areaOfRectangle;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter rectangle height value: ");
		rectangleHeight = scan.nextDouble();
		scan.close();
		
		rectangleWidth = rectangleHeight / 2;
		
		areaOfRectangle = rectangleWidth * rectangleHeight;
		
		System.out.println("Area of the rectangle is : " + areaOfRectangle);
	}

}
