package by.htp.les07.main;

import java.util.Arrays;

public class HomeworkTask01 {
//	1. C������ ������� 3 x 4, ��������� �� ������� 0 � 1 ���, ����� � ����� ������ ����
//	����� ���� �������, � ������� �� �����.
	public static void main(String[] args) {
		int [][] arrayTwoDim = new int [3][4];
		arrayTwoDim[0][0] = 1;
		arrayTwoDim[1][1] = 1;
		arrayTwoDim[2][2] = 1;
		
		System.out.println(Arrays.deepToString(arrayTwoDim));
		
	}

}
