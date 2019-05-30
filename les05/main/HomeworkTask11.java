package by.htp.les05.main;

import java.util.Scanner;

public class HomeworkTask11 {
//	11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления
//	на М равен L (0 < L < М-1).
	public static void main(String[] args) {
		int [] array;
		int m;
		int l;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the size of the array: ");
		array = new int [scan.nextInt()];
		System.out.print("Please enter the elements of the array: ");
		for (int i = 0; i<array.length; i++) { array[i] = scan.nextInt();}
		System.out.print("Please enter the value for M: ");
		m = scan.nextInt();
		System.out.print("Please enter the value for L: ");
		l = scan.nextInt();
		scan.close();
		
		for(int i = 0; i < array.length; i++) {
			if (array[i] / m == l) {
				System.out.println("Numbers that fit the equation: N/M=L are: " + array[i]);
			} 
		}
	}

}
