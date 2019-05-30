package by.htp.les05.main;

import java.util.Scanner;

public class HomeworkTask08 {
//	8. ƒан массив действительных чисел, размерность которого N. ѕодсчитать, сколько в нем
//	отрицательных, положительных и нулевых элементов.
	public static void main(String[] args) {
		int [] array;
		int counterNeg = 0;
		int counterPos = 0;
		int counterZero = 0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter N size of array: ");
		array = new int [scan.nextInt()];
		System.out.print("Please enter array elements: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();
		
		for (int i = 0; i<array.length; i++) {
			if (array[i] < 0) {
				counterNeg++;
			} else if (array[i] == 0) {
				counterZero++;
			} else if (array[i]>0) {
				counterPos++;
			}
		}
		System.out.println("Amount of positive numbers in array: " + counterPos);
		System.out.println("Amount of negative numbers in array: " + counterNeg);
		System.out.println("Amount of numbers equal to zero in array: " + counterZero);

	}

}
