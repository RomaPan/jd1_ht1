package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask28 {
//	28. ���� ��� ����� a, b, �. ����������, ����� �� ��� ����� d. ���� �� ���� �� ����� d, ��
//	����� max(d � a, d � b, d �c)
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int max;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter numbers A, B, C & D: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		scan.close();
		
		if (a == d) {
			System.out.println(" A == D");
		} else if (b == d) {
			System.out.println(" B == D");
		} else if (c == d) {
			System.out.println(" C == D");
		} else {
			if (((d - a) > (d - b)) && ((d - a) >(d - c))) {
				max = d - a;
				System.out.println("Max(d � a, d � b, d �c) = (d - a) = " + max);
			} else if (((d - b) > (d - a)) && ((d - b) >(d - c))) {
				max = d - b;
				System.out.println("Max(d � a, d � b, d �c) = (d - b) = " + max);
				} else if ((d - c) > (d - a) && (d - c) > (d - b)) {
					max = d - c;
					System.out.println("Max(d � a, d � b, d �c) = (d - c) = " + max); 
					}
			}
		if ((d - a) == (d - b) || (d - a) == (d - c) || (d - b) == (d - c)) {
			System.out.println("No possible solution, too many equal elements");
		}
		if ( (a == d) && (b == d) && (c == d) ) {
			System.out.println("A,B,C == D");
		} else if ((a == d) && (b == d)) {
			System.out.println("A,B == D");
		} else if ((a == d) && (c == d)) {
			System.out.println("A,C == D");
		} else if ( (b == d) && (c == d)) {
			System.out.println("B,C == D");
		}
		}
	}
