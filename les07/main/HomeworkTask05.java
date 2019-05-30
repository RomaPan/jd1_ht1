package by.htp.les07.main;

import java.util.Arrays;
import java.util.Random;

public class HomeworkTask05 {
//	5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.
	public static void main(String[] args) {
		int [][] multiArray = new int [10][10];
		
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				multiArray[i][j] = rand.nextInt(20+10);
			}
		}
		
		System.out.println(Arrays.deepToString(multiArray));
		
		int counter = 0;
		for (int i = 2; i < multiArray.length; i=i+2) {
			for (int j = 0; j < 10; j++) {
				System.out.print(multiArray[i][j] + " ");
				counter++;
				if (counter % 10 == 0) {
					System.out.println();
				}
			}
		}

	}

}
