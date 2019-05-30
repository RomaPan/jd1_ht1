package by.htp.les07.main;

import java.util.Arrays;
import java.util.Random;

public class HomeworkTask07 {
//	7. Дан двухмерный массив 5x5. Найти сумму модулей отрицательных нечетных элементов
	public static void main(String[] args) {
		int [][] multiArray = new int [5][5];
		int sum = 0;
		
		Random rand = new Random();
		
		for (int i = 0; i < multiArray.length; i++) {
			for (int j = 0; j < multiArray.length; j++) {
				multiArray[i][j] = rand.nextInt(20+1+1)-10;
				if (multiArray[i][j] < 0) {
					sum = sum + Math.abs(multiArray[i][j]);
				}
			}
		}

		
		System.out.println(Arrays.deepToString(multiArray));
		System.out.println("Sum of modules of all negative numbers in the array is: " + sum);
	}

}
