package by.htp.les05.main;

import java.util.Scanner;

public class HomeworkTask07 {
//	7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены,
//	большие данного Z, этим числом. Подсчитать количество замен.
	public static void main(String[] args) {
		int z;
		int [] array;
		int counter = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the number of elements in array: ");
		array = new int [scan.nextInt()];
		System.out.print("Please enter array elements: ");
		for (int i = 0; i<array.length; i++) {
			array[i] = scan.nextInt();
		}
		
		System.out.print("Please enter number Z: ");
		z = scan.nextInt();
		
		scan.close();
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > z) {
				array[i] = z;
				counter++;
			}
			
		}
		System.out.println("The amount of replacement instances: " + counter);
		

	}

}
