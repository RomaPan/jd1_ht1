package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask37 {
//	37. ��������� �������� ���������, ���������� �������� true, ���� ���������
//	������������ �������� ��������, � false � � ��������� ������:
//	� ����� ����� N �������� ������ ���������� ������.
//	� ����� ���� ������ ���� ��������� ��������������� ����� ����� ����� ���� ��� ��������� ����.
//	� ����� ���� ������� ������������ ����� N �������� ������ ������.
//	� ����� � ������������ (�, �) ����������� ����� ���������, ������� ����� ������� �= �, �= � (�<�).
//	� ������� ��������� ������������ ����� ����� ���� ����� ���� ����� �����.
//	� ����������� �� ��������� �,b,� �������� ��������������.
//	� ����� �����-���� ���� ���� ��������� ������������ ������������ ����� N ����� ������� �����.
//	� �������� ����� N �������� �������� ����� � (���������� ������� ����� ���������� � ��������� �� 0 �� 4).
//	� ������ ������� � = ��2 + b�+ � �������� ����� �������� ����� � ������������ (m,�).
	public static void main(String[] args) {
		int number;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		int sumOne;
		int sumTwo;
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer number: ");
		number = scan.nextInt();
		scan.close();
		
        
		//����� ����� N �������� ������ ���������� ������.
		if (number < 100 && number % 2 == 0 && number > 9) {
			System.out.println("true - 1");
		} else {
			System.out.println("false - 1.2");
		}
		
					
		//����� ���� ������ ���� ��������� ��������������� ����� ����� ����� ���� ��� ��������� ����.
		if (number > 999 && number <10000) {
			firstDigit = number / 1000;
			secondDigit = number / 100 % 10;
			thirdDigit = number / 10 % 10;
			fourthDigit = number % 10;
			sumOne = firstDigit + secondDigit;
			sumTwo = thirdDigit + fourthDigit;
			if (sumOne == sumTwo) {
				System.out.println("true - 2");
			} else {
				System.out.println("false - 2.1");
			}
		}else {
			System.out.println("false - 2.2");
		}
		
		
        // ����� ���� ������� ������������ ����� N �������� ������ ������.
		if (number > 99 && number < 999) {
			firstDigit = number / 100;
			secondDigit = number / 10 % 10;
			thirdDigit = number % 10;
			sumOne = firstDigit + secondDigit + thirdDigit;
			if (sumOne % 2 == 0) {
				System.out.println("true - 3");
			} else {
				System.out.println("false - 3.1");
			}
		} else {
			System.out.println("false - 3.2");
		}
		
	
		//����� � ������������ (�, �) ����������� ����� ���������, ������� ����� ������� �= �, �= � (�<�).
		if (number > 999 && number < 10000) {
			firstDigit = number / 1000;
			secondDigit = number / 100 % 10;
			thirdDigit = number / 10 % 10;
			fourthDigit = number % 10;
			if (firstDigit <= thirdDigit && secondDigit <= fourthDigit ) {
				System.out.println("true - 4");
			} else {
				System.out.println("false - 4.2");
			}
		} else {
			System.out.println("false - 4.1");
		}
		
		//������� ��������� ������������ ����� ����� ���� ����� ���� ����� �����.
		if (number > 99 && number < 999) {
			firstDigit = number / 100;
			secondDigit = number / 10 % 10;
			thirdDigit = number % 10;
			if (number*number == Math.pow((firstDigit + secondDigit + thirdDigit), 3) ) {
				System.out.println("true - 5");
			} else {
				System.out.println("false - 5.2");
			}
		} else {
			System.out.println("false - 5.1");
		}
		
		//����������� �� ��������� �,b,� �������� ��������������.
		if (number > 99 && number < 999) {
			firstDigit = number / 100;
			secondDigit = number / 10 % 10;
			thirdDigit = number % 10;
			if (firstDigit == secondDigit && secondDigit == thirdDigit) {
				System.out.println("true - 6");
			}
		} else {
			System.out.println("false - 6.1");
		}
		
		//����� �����-���� ���� ���� ��������� ������������ ������������ ����� N ����� ������� �����.
		if (number > 99 && number < 999) {
			firstDigit = number / 100;
			secondDigit = number / 10 % 10;
			thirdDigit = number % 10;
			if (firstDigit + secondDigit == thirdDigit || firstDigit + thirdDigit == secondDigit || secondDigit + thirdDigit == firstDigit) {
				System.out.println("true - 7");
			}	
		} else {
			System.out.println("false - 7.1");
		}
		//�������� ����� N �������� �������� ����� � (���������� ������� ����� ���������� � ��������� �� 0 �� 4).
		if (number >= 0 && number <= 4) {
			System.out.println("true - 8");
		} else {
			System.out.println("false - 8.1");
		}
		
		//������ ������� � = ��2 + b�+ � �������� ����� �������� ����� � ������������ (m,�).

	}

}
