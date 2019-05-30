package by.htp.les07.main;

import java.util.Arrays;
import java.util.Random;

public class HomeworkTask03 {
//	3. Дана матрица. Вывести на экран первый и последний столбцы.
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
			System.out.println(multiArray[i][0] + "  " + multiArray[i][4]);
			
		}
	}

}
