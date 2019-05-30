package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask33 {
//	33. Ввести любой символ и определить его порядковый номер, а также указать предыдущий
//	и последующий символы.
	public static void main(String[] args) {
		char ch;
		int placeNumber;
//		int previousOrderNumber;
//		int nextOrderNumber;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter any character: ");
		ch = scan.next().charAt(0); // scan.next (Возвращает стринг массив, charAt метод, возвращает символ в позиции).
//		ch = scan.next().trim().charAt(0);
		scan.close();
		
		placeNumber = ch; //convert Char to Unicode number
		
//		previousOrderNumber = placeNumber -1;
//		nextOrderNumber = placeNumber +1;
		
		System.out.println("This character Unicode order number is: " + placeNumber);
		System.out.println("Previous symbol in the Unicode chart is: " + "< "+((char)(placeNumber -1))+" >" + " with order number " + (placeNumber -1));
		System.out.println("Next symbol in the Unicode chart is: " + "< "+((char)(placeNumber + 1)) +" >" + " with order number " + (placeNumber +1));
		
		
		
		

	}

}
