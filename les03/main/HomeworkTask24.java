package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask24 {
//	24. —оставить программу, определ€ющую результат гадани€ на ромашке Ч ЂлюбитЧне
//	любитї, вз€в за исходное данное количество лепестков п.
	public static void main(String[] args) {
		int n;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please pick a number for fortune-reading on a camomile flower: ");
		n = scan.nextInt();
		scan.close();
		
		if ( n % 2 == 0 ) {
			System.out.println("He/She doesn't love you...");
		} else {
			System.out.println("He/She loves you!");
		}

	}

}
