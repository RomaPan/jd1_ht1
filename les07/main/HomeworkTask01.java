package by.htp.les07.main;

import java.util.Arrays;

public class HomeworkTask01 {
//	1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была
//	ровно одна единица, и вывести на экран.
	public static void main(String[] args) {
		int [][] arrayTwoDim = new int [3][4];
		arrayTwoDim[0][0] = 1;
		arrayTwoDim[1][1] = 1;
		arrayTwoDim[2][2] = 1;
		
		System.out.println(Arrays.deepToString(arrayTwoDim));
		
	}

}
