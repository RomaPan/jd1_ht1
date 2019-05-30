package by.htp.les07.main;

import java.util.Arrays;
import java.util.Random;

public class HomeworkTask06 {
//	6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
//	больше последнего.
	public static void main(String[] args) {
		int [][] multiArray = new int [5][5];
		
		Random rand = new Random();
		
		for (int i = 0; i < multiArray.length; i++) {
			for (int j = 0; j < multiArray.length; j++) {
				multiArray[i][j] = rand.nextInt(20+0);
			}
		}
		
		
		System.out.println(Arrays.deepToString(multiArray));

		if (multiArray[0][0] > multiArray[4][0]) {
			System.out.print("1st column: ");
			for (int k = 0; k < multiArray.length; k++) {
				System.out.print(multiArray[k][0] + " ");
			}
			
		}
		System.out.println();
		
		if (multiArray[0][2] > multiArray[4][2]) {
			System.out.print("3rd column: ");
			for (int k = 0; k < multiArray.length; k++) {
				System.out.print(multiArray[k][2] + " ");
			}
			
		}
		System.out.println();
		
		if (multiArray[0][4] > multiArray[4][4]) {
			System.out.print("5th column: ");
			for (int k = 0; k < multiArray.length; k++) {
				System.out.print(multiArray[k][4] + " ");
			}
			
		}
	}

}
