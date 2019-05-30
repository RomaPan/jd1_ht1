package by.htp.les05.main;

import java.util.Scanner;

public class HomeworkTask10 {
//	10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
	public static void main(String[] args) {
		int [] array;
		String s = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the size of the array: ");
		array = new int [scan.nextInt()];
		System.out.print("Please enter the numbers for the array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		} scan.close();
		
		for (int i = 0 ; i < array.length; i++) {
			if (array[i] > i) {
				s = s + array[i] + " ";
			}
		} System.out.println("Numbers, value of each is bigger than their index [Ai > i] : " + s);

	}

}
