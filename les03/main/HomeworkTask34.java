package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask34 {
//	34. ��������� ���������, ����������� ������ ���������� ���������� � �������
//	��������. ��������� ����������� ��������� ����, ����� �����, ��������� �����������;
//	���� ����� �� ���������, �������� �� ������ ��������; ���� ����� ������� ������, ���
//	����������, �� �������� ��������� ����� � ��������� ����� �����; ���� �����
//	������������, �� �������� ��������� �� ���� � ��������� ������ ����������� �����.
	public static void main(String[] args) {
		int price;
		int sum;
		int change;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the price of the book and sum of money: ");
		price = scan.nextInt();
		sum = scan.nextInt();
		scan.close();
		
		if (price == sum) {
			System.out.println("Thank you!");
			
		} else if (sum > price) {
			change = sum - price;
			System.out.println("Please take your change = " + change);
		} else if (sum < price) {
			change = Math.abs(price - sum);
			System.out.println("Not enough funds, please add = " + change + " to continue.");
		} 

	}

}
