package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask25 {
//	25. �������� ��������� � ������ ������� ��������� ������� � ���������, �������
//	������� ��������� �������������� �������� �, ���� ����������� � ������� ��������� 60�
//	�.
	public static void main(String[] args) {
		int temp;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter temperature value in C: ");
		temp = scan.nextInt();
		scan.close();
		
		if ( temp > 60) {
			System.out.println("Warning, fire hazard!");
		} else {
			System.out.println("Everything is nominal");
		}
	}

}
