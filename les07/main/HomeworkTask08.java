package by.htp.les07.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkTask08 {
//	8. Дан двухмерный массив NxM элементов. Определить, сколько раз встречается число
//	7 среди элементов массива.
	public static void main(String[] args) {
		int [][] multiArray;
		int m;
		int n;
		int counter = 0;
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter row size N: ");
		n = scan.nextInt();
		System.out.print("Please enter column size M: ");
		m = scan.nextInt();
		scan.close();
		
		multiArray = new int [n][m];
		
		Random rand = new Random();
		for(int i = 0; i< multiArray.length; i++ ) {
			for (int j = 0; j < multiArray.length; j++) {
				multiArray[i][j] = rand.nextInt(10+0);
				if (multiArray[i][j]== 7) {
					counter++;
				}
			}
		}
		System.out.println(Arrays.deepToString(multiArray));
		System.out.println("Number 7 appears in the array " + counter + " times.");
	}

}
