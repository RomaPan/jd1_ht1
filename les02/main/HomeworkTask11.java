package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask11 {
	//11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух
	//катетов.
	public static void main(String[] args) {
		double legA;
		double legB;
		double hypotenuse;
		double triangleArea;
		double trianglePerimeter;
		
		
		System.out.print("Please enter value for leg A: ");
		Scanner scan = new Scanner(System.in);
		legA = scan.nextDouble();
		System.out.print("Please enter value for leg B: ");
		legB = scan.nextDouble();
		scan.close();
		
		triangleArea = 0.5 * legA * legB;
		System.out.println("Triangle Area is: " + triangleArea);
		
		hypotenuse = Math.sqrt( Math.pow(legA, 2) + Math.pow(legB, 2));
		System.out.println("Triangle hypotenuse is: " + hypotenuse );
		
		trianglePerimeter = legA + legB + hypotenuse;
		System.out.println("Perimeter of the triangle is: " + trianglePerimeter);
	}

}
