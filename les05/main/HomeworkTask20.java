package by.htp.les05.main;

import java.util.Arrays;
import java.util.Scanner;


public class HomeworkTask20 {
//	20. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него
//	каждый второй элемент (освободившиеся элементы заполнить нулями). Примечание.
//	Дополнительный массив не использовать.
	public static void main(String[] args) {
		int n;

		int [] array;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter N size of the array: ");
		n = scan.nextInt();
		array = new int [n];
		System.out.println("Enter elements for the array: ");
		for (int i = 0; i < array.length; i++ ) {
			array[i] = scan.nextInt();	
		}
		
		for (int i = 1; i < array.length;) {
			array[i] = 0;
			i = i + 2;
			n = n - 1;
		}		
		System.out.println("Removed every second element and replaced with zero: " + Arrays.toString(array));
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] == 0 && array[j] != 0) {
					array[i] = array[j];
					array[j] = 0;
				
				}
				
			}
		}
	
//		System.out.println(n);
		System.out.println("Compressed and shifted left, zeros shifted right : " + Arrays.toString(array));
		
		scan.close();
		
		
		

	}

}
