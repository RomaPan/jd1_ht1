package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask21 {
//	21. ƒано действительное число R вида nnn.ddd (три цифровых разр€да в дробной и целой
//  част€х). ѕомен€ть местами дробную и целую части числа и вывести полученное значение
//	числа.
	public static void main(String[] args) {
		double userNumber;
		double ddd;
		double nnn;
		
		double newNumber;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter any float number of a type <nnn,ddd>: ");
		userNumber = scan.nextDouble();
		scan.close();
		
		ddd = (userNumber / 1000);
		nnn = ((userNumber % 1) * 1000);
		
		newNumber = ddd + nnn;
		System.out.printf("New reversed number is: %.3f%n", newNumber);
	}
}
