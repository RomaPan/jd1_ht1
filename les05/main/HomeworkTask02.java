package by.htp.les05.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class HomeworkTask02 {
//	2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров
//	этих элементов.
	public static void main(String[] args) {
		int n = 0;
		String indexString = "";
		int size = 0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the number of elements in a sequence: ");
		size = scan.nextInt();
		int [] array = new int [size];
		
		try {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt((10-0)+1)+0;
		}
		
		System.out.println(Arrays.toString(array));
		scan.close();
		for (int j = 0; j < array.length; j++) {
			if (array[j] == 0) {
				indexString = indexString + j + " ";
				n = n + 1;		
			} 
		}
		String [] arrayFromIndexString = indexString.trim().split(" ");
		
		int[] indexOfZeros = new int[arrayFromIndexString.length];
		 for (int i=0; i < arrayFromIndexString.length; i++) {
			 indexOfZeros[i] = Integer.parseInt(arrayFromIndexString[i]);
			 }
		System.out.println("Zeros found at this indexes: " + indexString);
		System.out.println("Counter of found zeros: " + n);
		System.out.println("Array of indexes of zeroes: " + Arrays.toString(indexOfZeros));
		} 
		
		catch (NumberFormatException e) {
			System.out.println("Ooops! Sorry!");
			System.out.println("Initial array was generated without any zeros. try again.");
		}
	}

}
