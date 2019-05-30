package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask35 {
//	35. Вычислить число и месяц в невисокосном году по номеру дня
	public static void main(String[] args) {
		int day;
		
		
		int jan = 31;
		int feb = 28;
		int mar = 31;
		int apr = 30;
		int may = 31;
		int jun = 30;
		int jul = 31;
		int aug = 31;
		int sep = 30;
		int oct = 31;
		int nov = 30;
		int dec = 31;

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter day number from 0 to 365: ");
		day = scan.nextInt();
		scan.close();
		
		if (day > 0 && day <= jan) {	
			System.out.println(day + " of Jan");			
		} 
		
		else if (day > 31 && day <= jan + feb) {
			day = day - jan;
			System.out.println(day + " of Feb");
		}
		
		else if (day > jan + feb && day <= jan + feb + mar) {
			day = day - (jan + feb);
			System.out.println(day + " of Mar");
		}
		
		else if (day > jan + feb + mar && day <= jan + feb + mar + apr) {
			day = day - (jan + feb + mar);
			System.out.println(day + " of Apr");
		}
		else if (day > jan + feb + mar + apr && day <= jan + feb + mar + apr + may) {
			day = day - (jan + feb + mar + apr);
			System.out.println(day + " of May");
		}
		else if (day > jan + feb + mar + apr + may && day <= jan + feb + mar + apr + may + jun) {
			day = day - (jan + feb + mar + apr + may);
			System.out.println(day + " of Jun");
		}
		else if (day > jan + feb + mar + apr + may + jun && day < jan + feb + mar + apr + may + jun + jul) {
			day = day - (jan + feb + mar + apr + may + jun);
			System.out.println(day + " of Jul");
		}
		else if (day > jan + feb + mar + apr + may + jun + jul && day <= jan + feb + mar + apr + may + jun + jul + aug) {
			day = day - (jan + feb + mar + apr + may + jun + jul);
			System.out.println(day + " of Aug");
		}
		else if (day > jan + feb + mar + apr + may + jun + jul + aug && day <= jan + feb + mar + apr + may + jun + jul + aug + sep) {
			day = day - (jan + feb + mar + apr + may + jun + jul + aug);
			System.out.println(day + " of Sep");
		}
		else if (day > jan + feb + mar + apr + may + jun + jul + aug + sep && day <= jan + feb + mar + apr + may + jun + jul + aug + sep + oct) {
			day = day - (jan + feb + mar + apr + may + jun + jul + aug + sep);
			System.out.println(day + " of Oct");	
		}
		else if (day > jan + feb + mar + apr + may + jun + jul + aug + sep + oct && day <= jan + feb + mar + apr + may + jun + jul + aug + sep + oct + nov) {
			day = day - (jan + feb + mar + apr + may + jun + jul + aug + sep + oct);
			System.out.println(day + " of Nov");	
		}
		else if (day > jan + feb + mar + apr + may + jun + jul + aug + sep + oct + nov && day <= jan + feb + mar + apr + may + jun + jul + aug + sep + oct + nov + dec) {
			day = day - (jan + feb + mar + apr + may + jun + jul + aug + sep + oct + nov);
			System.out.println(day + " of Dec");
		}
		
	}

}
