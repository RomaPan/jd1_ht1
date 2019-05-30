package by.htp.les06.main;

import java.util.Scanner;

public class HomeworkTask16 {
//	16. Два простых числа называются «близнецами», если они отличаются друг от друга на 2
//	(например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n -
//	заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
	public static void main(String[] args) {
		int n;
		int n2;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter number for N: ");
		n = scan.nextInt();
		System.out.print("Please enter number for 2N: ");
		n2 = scan.nextInt();
		scan.close();
		
		System.out.println(twinNumbers(n, n2));

	}
	
	public static String twinNumbers(int n, int n2) {
		String str = "";
		for (int i = n+2; i < n2; i = i+2) {
			str = str + (i) + " ";
		}
		return str;
	}

}
