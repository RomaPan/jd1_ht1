package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask33 {
//	33. �������� ���������, ������� �� ������ ����� ���������� ������� ������� ����������
//	� ��������� ���������� � ���� ������. ������ � ���� ����� ������ ����� �������,
//	�������� �� ��� ������ �� ������� �������. ��� ����� ��������� ������: 9583, 1747 �
//	�������� ������ ��� �, �, �; 3331, 7922 � �������� ������ ��� �, �; 9455, 8997 � ��������
//	������ ���� �.
	public static void main(String[] args) {
		int number;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your password: ");
		number = scan.nextInt();
		scan.close();
		
		if (number == 9583 || number == 1747) {
			System.out.println("Your level of access is ABC");
		} else if (number == 3331 || number == 7922) {
			System.out.println("Your level of access is BC");
		} else if (number == 9455 || number == 8997) {
			System.out.println("Your level of access is C");
		} else {
			System.out.println("Access denied");
		}

	}

}
