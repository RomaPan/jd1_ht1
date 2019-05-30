package by.htp.les06.main;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkTask07 {
//	7. Ќа плоскости заданы своими координатами n точек. Ќаписать метод(методы),
//	определ€ющие, между какими из пар точек самое большое рассто€ние. ”казание.
//	 оординаты точек занести в массив
	public static void main(String[] args) {
		int numberOfPoints;
		int [] array;
		int j = 0;
		
		
		int aX, aY;
		
		int bX, bY;
		int cX, cY;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the amount of points A,B,C,...: ");
		numberOfPoints = scan.nextInt();
		
		array = new int [numberOfPoints*2];

		System.out.print("Point coordinates: ");
		
		do {
			array[j] = scan.nextInt();
			j++;
		}
		while(j < array.length);
		scan.close();
		
		
		System.out.println("Array of point coordinates: " + Arrays.toString(array));
		
		
		
		
		int differenceX = 0;
		int tempX = 0;
		int tempY = 0;
		int differenceY = 0;
		
		for (int i = 0; i < array.length; i = i +2) {
			for (int k = 1; k < array.length; k = k +2) {
				
				if (Math.abs(array[i] - array[i+2]) > differenceX ) {
					differenceX = array[i];
					if (differenceX > tempX) {
						tempX = differenceX;
					}
				}
				
				if (Math.abs(array[k] - array[k+2]) > differenceY) {
					differenceY = array[k];
					if (differenceY > tempY) {
						tempY = differenceY;
					}
				}
			}
		} System.out.println(tempX + " " + tempY);
		

	}
	
	public static int longestDistance(int [] anyArray) {
		int longDistX = 0;
		int longDistY = 0;
		for (int i = 0; i < anyArray.length; i = i + 2) {
			for (int j = 1; j < anyArray.length; j = j + 2) {
				if (anyArray[i] > anyArray[i+2] && anyArray[j] > anyArray[j+2]) {
					longDistX = Math.abs(anyArray[i] - anyArray[i+2]);
					longDistY = Math.abs(anyArray[i] - anyArray[i+2]);
				}
			}
		}
		
		return longDistX;
	}

}
