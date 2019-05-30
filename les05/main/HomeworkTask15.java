package by.htp.les05.main;

import java.util.Scanner;

public class HomeworkTask15 {
//	15. Дана последовательность действительных чисел
//	a1,a2,...,an . Указать те ее элементы, которые принадлежат отрезку [с, d]
	public static void main(String[] args) {
		int [] array;
		int c;
		int d;
		int n;
		String s = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the size of the array: ");
		n = scan.nextInt();
		array = new int [n];
		System.out.print("Please enter elements of the array: ");
		for(int i = 0; i<array.length; i++) {
			array[i] = scan.nextInt();
		}
		System.out.print("Enter the period [c, d]: ");
		c = scan.nextInt();
		d = scan.nextInt();
		scan.close();
		
		for (int i = 0; i<array.length; i++) {
			if (array[i] > c && array [i] < d) {
				s = s + array[i] + " ";
			} 
		}
		System.out.println("Elements of the array that belong to period [c, d]: " + s);

	}

}
