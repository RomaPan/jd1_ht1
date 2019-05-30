package by.htp.les06.main;

import java.util.Scanner;

public class HomeworkTask06 {
//	6. Вычислить площадь правильного шестиугольника со стороной а, используя метод
//	вычисления площади треугольника
	public static void main(String[] args) {
		int a;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter value for side A: ");
		a = scan.nextInt();
		scan.close();
		
		System.out.println("Area of the hexagon with side A is: " + areaHexagon(a));
		
		
	}
	
	public static double areaHexagon(int a) {
		double areaS = (((Math.sqrt(3)*a*a))/4) * 6;
		return areaS;
	}

}
