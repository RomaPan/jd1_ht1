package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask27 {
//	27. ���� �������� a. �� ��������� ������� ������� � ������� ��������, �����
//	���������, �������� �������� �8 �� ��� �������� � �10 �� ������ ��������
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter value for <a>: ");
		a = scan.nextDouble();
		scan.close();
		
		b = (a * a * a) * (a * a * a) *(a * a);
		c = (a * a * a) * (a * a * a) * (a * a * a) * a;
		
		System.out.println("a^8 = " + b);
		System.out.println("a^8d = " + c);

	}

}
