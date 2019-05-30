package by.htp.les05.main;

import java.util.Arrays;

import java.util.Scanner;

public class HomeworkTask16 {
//	16. Даны действительные числа a1,a2,...,an . Найти max(a1 + a2n,a2 + a2n−1,..,an + an+1).
	public static void main(String[] args) {
		int [] array;
		int n;
		int maxSum;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the size of the array N: ");
		n = scan.nextInt();
		array = new int [n];
		System.out.print("Please enter the elements of the array: ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();
		maxSum = array[0] + array[array.length-1];
		
		for (int i = 1; i < array.length / 2; i++) {
			
            if ((array[i] + array[(array.length - i)-1]) > maxSum) {
                maxSum = array[i] + array[(array.length-i)-1];
                }
            }
		System.out.println("The array of N numbers is : " + Arrays.toString(array));
		System.out.println("Max sum of the equation max(a1 + a2n,a2 + a2n−1,..,an + an+1) is: " + maxSum);
		
		
		

	}

}
