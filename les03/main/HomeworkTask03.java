package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask03 {
//	3. Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово
//	«yes», если число а меньше 3; если больше, то вывести слово «no»
	public static void main(String[] args) {
		int a;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter value for < a > : ");
		a = scan.nextInt();
		
		scan.close();
		
		if (a < 3 ) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
