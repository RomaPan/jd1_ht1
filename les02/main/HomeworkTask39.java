package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask39 {
//	39. ���� �������������� ����� �. �� ��������� �������� ������� ���������������
//	����������, ����� ���������, �������� � ���������, ��������� �� ����������� �����
//	��������: f = 2x^4 - 3�^3 + 4�^2 - 5� + 6;
	public static void main(String[] args) {
		double f;
		int x;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter value for x: ");
		x = scan.nextInt();
		scan.close();
		
		f = x*x*(2*x*x - 3*x + 4) - 5*x + 6;
		System.out.println(f);
	}

}
