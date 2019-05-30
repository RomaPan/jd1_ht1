package by.htp.les07.main;

import java.util.Arrays;
import java.util.Random;

public class HomeworkTask02 {
//	2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0,9].
	public static void main(String[] args) {
		int [][] multiArray = new int [2][3];
		
		Random rand = new Random();
		
		for (int i = 0; i <2; i++) {
			for(int j = 0; j < 3; j++) {
				multiArray[i][j] = rand.nextInt(9+1);
			}
		}
		
		System.out.println(Arrays.deepToString(multiArray));

	}

}
