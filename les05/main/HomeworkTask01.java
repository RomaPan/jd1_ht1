package by.htp.les05.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkTask01 {
//	1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны
//	данному К.
	public static void main(String[] args) {
		
		int k;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the size N of the array: ");
		
		int [] array = new int [scan.nextInt()];
		System.out.println("To find sum of elemets equal to K in a randomly generated array");
		System.out.print("Please enter K value here: ");
		k = scan.nextInt();
		scan.close();
		
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(9+1)+1;
		}

		System.out.println(Arrays.toString(array));
		for (int j = array[0]; j < array.length; j++) {
			if (array[j] == k) {
				sum = sum + array[j];
			}
			
		}
		System.out.println("Sum of array elements that are equal to K is: " + sum);
	}

}
