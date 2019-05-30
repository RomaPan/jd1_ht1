package by.htp.les05.main;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkTask14 {
//	14. Дан одномерный массив A[N]. Найти:
//		max(a2,a4,...,a2k) + min(a1,a3,...,a2k +1)
	public static void main(String[] args) {
		int [] array;
		int n;
		int minOdd = 9;
		int maxEven = 0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the size of the array: ");
		n = scan.nextInt();
		
		array = new int [n];
		
		System.out.print("Please enter elements of the array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxEven && array[i] % 2 == 0 ) {
				maxEven = array[i];
			} else if (array[i] < minOdd && array[i] % 2 != 0) {
				minOdd = array[i];
			}
		}
		System.out.println(" Array="+ Arrays.toString(array) + ",  min =" + minOdd+ " &  max="+maxEven);
		System.out.println("max(a2,a4,...,a2k) + min(a1,a3,...,a2k +1) = " + (minOdd+maxEven));
		
		
		
	}

}
