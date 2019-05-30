package by.htp.les07.main;

import java.util.Arrays;
import java.util.Random;

public class HomeworkTask04 {
//	4. Дана матрица. Вывести на экран первую и последнюю строки.
	public static void main(String[] args) {
int [][] multiArray = new int [5][5];
		
		Random rand = new Random();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				multiArray[i][j] = rand.nextInt(20 + 10);
			}
		}
		System.out.println(Arrays.deepToString(multiArray));
		
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print(multiArray[0][i] + "  ");
			
		}
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			System.out.print(multiArray[4][i] + "  ");
			
		}

	}

}
