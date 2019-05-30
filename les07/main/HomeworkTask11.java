package by.htp.les07.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkTask11 {
//	11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая
//	строка справа налево, вторая строка слева направо, третья строка справа налево и так
//	далее
	public static void main(String[] args) {
		int [][] multiArray;
		
		int m;
		int n;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter amount of rows in the array <M> = ");
		m = scan.nextInt();
		System.out.print("Please enter amount of columns in the array <N> = ");
		n = scan.nextInt();
		
		scan.close();
		
		multiArray = new int [m][n];
		
		Random rand = new Random();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				multiArray[i][j] = rand.nextInt(10+1);
			}
		}
		
		System.out.println(Arrays.deepToString(multiArray));
		
		for (int i = 0; i < m; i++) { // printing array row items in reverse order
			if ( i % 2 == 0) {
				for (int j = multiArray.length-1; j >= 0; j--) {
					System.out.print(multiArray[i][j] + " ");
				}
			}
			if (i % 2 > 0) {
				for (int j = 0; j<n; j++) { // printing rows left to right
					System.out.print(multiArray[i][j] + " ");
				}
			}
			System.out.println();
		}
		
	}

}
