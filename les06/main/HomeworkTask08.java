package by.htp.les06.main;

import java.util.Scanner;

public class HomeworkTask08 {
//	8. Составить программу, которая в массиве A[N] находит второе по величине число
//	(вывести на печать число, которое меньше максимального элемента массива, но больше
//	всех других элементов).
	public static void main(String[] args) {
		int n;
		int [] array;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter size of the array: ");
		n = scan.nextInt();
		System.out.print("Please enter elements of the array: ");
		
		array = new int  [n];
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();	
		secondLargestNumber(array);
		System.out.println("Second largest number in the arrays is: " + secondLargestNumber(array));
		
	}
	
	public static int secondLargestNumber (int [] anyArray) {
		int secondLargest = 0;
		int largest = 0;
		for (int i = 0; i < anyArray.length; i++) {
			if (anyArray[i] > largest ) {
				largest = anyArray[i];
			}
		}
		for (int i = 0; i < anyArray.length; i++) {
			if (anyArray[i] > secondLargest && anyArray[i] < largest ) {
				secondLargest = anyArray[i];
			}
		}
		return secondLargest;
	}

}
