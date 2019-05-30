package by.htp.les06.main;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkTask15 {
//	15. Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
//	элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
	public static void main(String[] args) {
		int n;
		int k;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter number K in range (1 - 100): ");
		k = scan.nextInt();
		System.out.print("Please enter number N in range (1 - 100): ");
		n = scan.nextInt();
		scan.close();
		
		System.out.println("Array A is = " + Arrays.toString(sumKtoArray(sumOfNumbers(k, n))));
	}
	
	
	
	public static String sumOfNumbers (int k, int n) {
		String sumK = "";
		int a;
		int b;
		int c;
		
		for (int i = 0; i < 100; i++) {
			a = i / 10;
			b = i % 10;
			c = (a + b);
			if (c == k && i < n) {
				sumK = sumK + i + " ";
			}
		}
		return sumK;
	}
	
	
	
	
	public static int [] sumKtoArray(String s) {
//		
		String [] arrayOfStrings = new String [s.length()];
		
		arrayOfStrings = s.split(" ");

		int [] array = new int [arrayOfStrings.length];
		
		for (int i = 0; i < arrayOfStrings.length; i++) {
			
			array[i] = Integer.parseInt(arrayOfStrings[i]);
		}
		
		return array;
	}

}
