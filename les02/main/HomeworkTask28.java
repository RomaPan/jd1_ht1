package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask28 {
//	28. Составить программу перевода радианной меры угла в градусы, минуты и секунды
	public static void main(String[] args) {
	int radians;
	int degree;
	int minutes;
	int seconds;
	double pi = Math.PI;
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Please enter radians value for conversion: ");
	radians = scan.nextInt();
	scan.close();
	
	degree = (int) (radians * 180 / pi);
	
	minutes = degree % 3600 / 60;
	
	seconds = degree % 3600 % 60;
	
	System.out.println("Converted value is: " + degree + "D : " + minutes + "m : " + seconds + "s");
	

	}

}
