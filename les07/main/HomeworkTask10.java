package by.htp.les07.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkTask10 {
//	10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
	public static void main(String[] args) {
		int [][] multiArray;
		int n;
		int k;
		int p;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the size of the array NxN: ");
		n = scan.nextInt();
		Random rand = new Random();
		multiArray = new int [n][n];
		for(int i = 0; i<multiArray.length; i++) {
			for (int j = 0; j<multiArray.length; j++) {
				multiArray[i][j] = rand.nextInt(10+1)+2;
			}
		}
		System.out.println(Arrays.deepToString(multiArray));
		
		System.out.print("Please enter row index <K> to be printed: ");
		k = scan.nextInt();
		
		for (int i = 0; i < multiArray.length; i++) {
			System.out.print(multiArray[k-1][i] + " ");
		}
		System.out.println();
		System.out.print("Please enter column index <P> to be printed: ");
		p = scan.nextInt();
		
		scan.close();

		for (int i = 0; i < multiArray.length; i++) {
			System.out.print(multiArray[i][p-1] + " ");
		}
	}

}
