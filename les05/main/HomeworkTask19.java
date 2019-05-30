package by.htp.les05.main;


import java.util.Scanner;

public class HomeworkTask19 {
//	19. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся
//	число. Если таких чисел несколько, то определить наименьшее из них.
	public static void main(String[] args) {
		int n;
		int [] array;
		int commonNumberFirst = 0;
		int commonNumberSecond = 0;

		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the size of the array: ");
		n = scan.nextInt();
		array = new int [n];
		System.out.print("Please enter elemenents of the array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();
		
//		 i->
//		[1,2,1,4,5,6,7,8,9,10]
//		   j->
		   
		   
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[j] == array[i]) {
					commonNumberFirst = array[i];
				}
					
				}
			}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[j] == array[i] && array[i] != commonNumberFirst) {		
					commonNumberSecond = array[i];
				}
					
				}
			}
		
		if (commonNumberFirst > commonNumberSecond) {
			System.out.println("Most commont smallest number in the array is: " + commonNumberSecond);
		} else {
			System.out.println("Most commont smallest number in the array is: " + commonNumberFirst);
		}
		
		}
}
