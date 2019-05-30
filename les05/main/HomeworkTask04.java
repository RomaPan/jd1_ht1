package by.htp.les05.main;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkTask04 {
//	4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она
//	возрастающей.
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the number of sequence elements in the array: ");
		int [] array = new int [scan.nextInt()];
		System.out.print("Please enter numbers for the array: ");
		for (int i = 0; i < array.length; i++) {
			array [i] = scan.nextInt();
		}
			if (array[0] > array[1] && array [1] > array[2] && array[2] > array[3] ) {
				System.out.println("Array is not in ascending order.");
			} 
		System.out.println("Your array is in ascending order : " + Arrays.toString(array));
		scan.close();
	}

}
