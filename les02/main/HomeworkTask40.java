package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask40 {
//	40. ���� �������� �. �������� �������� -2� + 3�2 - 4�3 � 1 + 2� + 3�2 + 4�3 . ������������ ��
//	�������� ��������.
	public static void main(String[] args) {
		int x;
		double f;
		double z;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter value for x: ");
		x = scan.nextInt();
		scan.close();
		
		f = x*(-2 + 3 * x - 4*x*x);
		System.out.println(f);
		
		z = 1 + x*(2 + 3*x + 4*x*x);
		System.out.println(z);
	}

}
