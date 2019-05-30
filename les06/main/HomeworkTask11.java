package by.htp.les06.main;

import java.util.Arrays;
import java.util.Random;

public class HomeworkTask11 {
//	11. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5];
//	D[4] +D[5] +D[6]. Пояснение. Составить метод(методы) для вычисления суммы трех последовательно
//	расположенных элементов массива с номерами от k до m
	public static void main(String[] args) {
		int [] array;
		
		Random rand = new Random();
		array = new int [6];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(((10-1)+1)+1);
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Sum D[l] + D[2] + D[3] = " + getSum(array,array[0],array[1],array[2]));
		System.out.println("Sum D[3] + D[4] + D[5] = " + getSum(array,array[2],array[3],array[4]));
		System.out.println("Sum D[4] + D[5] + D[6] = " + getSum(array,array[3],array[4],array[5]));
		System.out.println();
		
		
		System.out.println("Sum D[l] + D[2] + D[3] = " + getSumIndex(array,0,2));
		System.out.println("Sum D[3] + D[4] + D[5] = " + getSumIndex(array,2,4));
		System.out.println("Sum D[4] + D[5] + D[6] = " + getSumIndex(array,3,5));
																	
	}
	
	public static int getSum(int [] anyArray, int a, int b, int c) {
		int sum = 0;
		
		sum = a + b + c;
		
		return sum;
	}
	// Второй вариант "Примечание" считает сумму элементов в промежутке от k до m
	public static int getSumIndex(int [] anyArray, int k, int m) {
		int sum = 0;
		for (int i = k; i <= m; i++) {
			sum = sum + anyArray[i];
		}
		
		
		return sum;
	}

}