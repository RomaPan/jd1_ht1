package by.htp.les05.main;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkTask09 {
//	9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший
//	элементы.
	public static void main(String[] args) {
		int [] array;
		int biggestNumber = 1;
		int smallestNumber = 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the size of the array: ");
		array = new int [scan.nextInt()];
		System.out.print("Please enter elements of the array: ");
		for (int i = 0; i<array.length; i++) {
			array[i] = scan.nextInt();
			
		}scan.close();
		
		for (int i = 0; i<array.length; i++) {
			if (array[i] > biggestNumber) {
				biggestNumber = array[i];
			} else if (array[i] < smallestNumber) {
				smallestNumber = array[i];
			}
		}
		for (int i = 0; i<array.length; i++) {
			if (array[i] == biggestNumber) {
				array[i] = smallestNumber;
			} else if (array[i] == smallestNumber) {
				array[i] = biggestNumber;
			}
		}
		System.out.println(Arrays.toString(array));

	}

}
