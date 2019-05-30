package by.htp.les07.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkTask09 {
//	9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
	public static void main(String[] args) {
		int [][] multiArray;
		int size;
		String diagonalNumbers = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the size of the array: ");
		size = scan.nextInt();
		
		scan.close();
		
		Random rand = new Random();
		
		multiArray = new int [size][size];
		
		for (int i = 0; i<multiArray.length; i++) {
			for (int j = 0; j<multiArray.length; j++) {
				multiArray[i][j]= rand.nextInt(10+1);
				if (i == j) {
					diagonalNumbers = diagonalNumbers + multiArray[i][j] + " "; 
				}
			}
		}
		System.out.println(Arrays.deepToString(multiArray));
		System.out.println("Numbers, located in diagonal line inside the array matrix: " + diagonalNumbers);
		
//		for (int i = 0; i<multiArray.length; i++) {
//			for (int j = 0; j<multiArray.length; j++) {
//				if (i == j) {
//					System.out.print(multiArray[i][j] + " ");
//				}
//			}
//		}

	}

}
