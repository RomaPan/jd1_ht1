package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask17 {
//	17. Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и тем
//	же числом, равным большему из исходных, а если равны, то заменить числа нулями.
	public static void main(String[] args) {
		int m;
		int n;
		
		Scanner scan = new Scanner(System.in);
		System.out.print(" Please enter 2 integer vaules for <M> and <N> numbers: ");
		m = scan.nextInt();
		n = scan.nextInt();
		scan.close();
		
		if (m != n) {
			if (m > n) {
				n = m;
				System.out.println("M = " + m + " N = " + n);
			} else {
				m = n;
				System.out.println("M = " + m + " N = " + n);
			}
		} else {
			m = 0;
			n = 0;
			System.out.println("M = " + m + " N = " + n);
		}

	}

}
