package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask23 {
//	23. ���������� ������������ ����, ��������� � ���������� (����� � �� 1 �� 31, ����� �
//	�� 1 �� 12). ���� ������� ������������ ������, �� �������� �� ����.
	public static void main(String[] args) {
		int d;
		int m;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the date: DD MM : ");
		d = scan.nextInt();
		m = scan.nextInt();
		scan.close();
		
		if (d >= 1 && d <= 31 && m >=1 && m <= 12) {
			System.out.println("You have entered correct date format!");
		} else {
			System.out.println("You have entered incorrect date, please try again.");
		}

	}

}
