package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask29 {
//	29. ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� ��
//	����� ������.
	public static void main(String[] args) {
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		double a;
		double b;
		double c;
		double s;
		double p;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter coordinates for point A(x1,y1): ");
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		System.out.print("Please enter coordinates for point B(x2,y2): ");
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		System.out.print("Please enter coordinates for point C(x3,y3): ");
		x3 = scan.nextInt();
		y3 = scan.nextInt();
		scan.close();
		
		a = Math.sqrt((Math.pow(Math.abs(x1-x2),2)) + (Math.pow(Math.abs(y1-y2),2)));
		b = Math.sqrt((Math.pow(Math.abs(x2-x3),2)) + (Math.pow(Math.abs(y2-y3),2)));
		c = Math.sqrt((Math.pow(Math.abs(x1-x3),2)) + (Math.pow(Math.abs(y1-y3),2)));
		p = (a+b+c) / 2;
		s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		if (s == 0) {
			System.out.println("Points A, B, C = located on the same line.");
		} else {
			System.out.println("Points A, B, C = are not located on the same line.");
		}

	}

}
