package by.htp.les06.main;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkTask13 {
//	13. Дано натуральное число N. Написать метод(методы) для формирования массива,
//	элементами которого являются цифры числа N.
	public static void main(String[] args) {
		int n;
		int [] array;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter N number: ");
		n = scan.nextInt();
		System.out.print("Please enter the size of the array: ");
		array = new int [scan.nextInt()];
		scan.close();
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(arrayWithN(array,array.length,n)));

	}
	
	public static int[] arrayWithN(int [] anyArray, int size, int cellNum) {
//		int [] arrayN = new int [size];
		for (int i = 0; i < anyArray.length; i++) {
			anyArray[i] = cellNum;
		}
		
		return anyArray;
	}
}
