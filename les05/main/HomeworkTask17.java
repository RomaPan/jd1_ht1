package by.htp.les05.main;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkTask17 {
//	17. Дана последовательность целых чисел a1,a2,...,an. Образовать новую последовательность, 
//	выбросив из исходной те члены, которые равны min(a1,a2,...,an) 
	public static void main(String[] args) {
		int [] array;
		int n;
		int minNum;
		int count = 0;
		int numIndex;

		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the size of the array N: ");
		n = scan.nextInt();
		array = new int [n];
		System.out.print("Please enter the elements of the array: ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();
		
		minNum = array[0];
		for (int i = 1; i < array.length; i++ ) {
			if (array[i] < minNum) {
				minNum = array[i];
			}
		}
		
		for (int value : array) {
            if (value == minNum) {
                count++;
            }
        }
		
		int [] minArray = new int [array.length - count];
		
		numIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != minNum) {
				minArray[numIndex] = array[i];
				numIndex++;
			}
		}
		
		
		System.out.println("The array of N numbers is : " + Arrays.toString(array));
		System.out.println("Reformed array: " + Arrays.toString(minArray));
	}

}