package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask32 {
//	32. Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59).
//	Какое время будут показывать часы через р ч q мин r с?
	public static void main(String[] args) {
		int t;
		int n;
		int k;
		int seconds1;
		
		int p;
		int q;
		int r;
		int seconds2;
		
		int time;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter starting time: HH MM SS : ");
		t = scan.nextInt();
		n = scan.nextInt();
		k = scan.nextInt();
		seconds1 = t*3600 + n*60 + k;
		System.out.println(seconds1);
		
		System.out.println("Entered time: " + t + "h " + n + "m " + k + "s");
		System.out.print("Please enter time to add to existing clock value (HH MM SS): ");
		p = scan.nextInt();
		q = scan.nextInt();
		r = scan.nextInt();
		scan.close();
		
		seconds2 = p*3600 + q*60 + r;
		System.out.println(seconds2);
		
		time = seconds1 + seconds2;
		System.out.println("New time value is: " + (time / 3600) + "h " + (time / 60 % 60) + "m " + (time % 3600 % 60) + "s");
		

	}

}
