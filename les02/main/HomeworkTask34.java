package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask34 {
//	34. Дана величина А, выражающая объем информации в байтах. Перевести А в более
//	крупные единицы измерения информации
	public static void main(String[] args) {
		byte a;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter byte number from -128 to 127:");
		a = scan.nextByte();
		scan.close();
		
		System.out.println("Byte number converted to short: " + (short)a);
		System.out.println("Byte number converted to long: " + (long)a);
		System.out.println("Byte number converted to int: " + (int)a);
		System.out.println("Byte number converted to float: " + (float)a);
		System.out.println("Byte number converted to double: " + (double)a);
		System.out.println("Byte number converted to char: " + (char)a);
		

	}

}
