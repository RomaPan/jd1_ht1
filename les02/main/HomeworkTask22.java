package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask22 {
//	22. Дано натуральное число Т, которое представляет длительность прошедшего времени в
//	секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей
//	форме: ННч ММмин SSc.
	public static void main(String[] args) {
		int hours;
		int minutes;
		int seconds;
		int timeInput;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter time in seconds for transformation: ");
		timeInput = scan.nextInt();
		scan.close();
		
		hours = timeInput / 3600;	
		minutes = timeInput % 3600 / 60;	
		seconds = timeInput % 3600 % 60;
		
		System.out.println("Formated time : " + hours + "h " + minutes + "m " + seconds + "s" );

	}

}
