package by.htp.les05.main;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkTask18 {
//	18*. �����������. ��������� ����� ��� ����� ������� �� 10 ������������� � ��� �����, �
//	������� ���� �������� ��������� ������. �� ����� ����������� ������ � ��� ������, �����
//	� ����� ���� �������� ������� ����� ����� �� �������� ������ ������� ����� 10.
//	(��������� ����� ����� �� ������ ����� �� 1 �� 6 �����). �������� ���������, �������
//	����������� ��� ����� ��� �������, ��� ��� ������ ��� ��������� � ������.
	public static void main(String[] args) {
		
		int cubeOne;
		int cubeTwo;
		int cubeThree;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter face values(1 - 6) for two cubes, Sum of two should be no less than 4: ");
		
		cubeOne = scan.nextInt();
		cubeTwo = scan.nextInt();
		
		scan.close();
	
		cubeThree = 10 - (cubeOne + cubeTwo);
		
		if (cubeThree <= 6 && cubeThree > 0 && cubeOne + cubeTwo + cubeThree == 10) {
			
			int [] array = {cubeOne,cubeTwo,cubeThree,cubeOne,cubeTwo,cubeThree,cubeOne,cubeTwo,cubeThree,cubeOne};
			
			System.out.println("Third missing cube face value is: " + cubeThree);
			System.out.println("Lock code sequence is : " +Arrays.toString(array));
		} else {
			System.out.println("Impossible lock combination, sequence has no solution");
		}

	}

}
