package by.htp.les05.main;

import java.util.Scanner;

public class HomeworkTask12 {
//	12. «адана последовательность N вещественных чисел. ¬ычислить сумму чисел,
//	пор€дковые номера которых €вл€ютс€ простыми числами.
	public static void main(String[] args) {
		int [] array;
		int sum = 0;
		String s = "";
				
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the size of the array: ");
		array = new int [scan.nextInt()];
		System.out.print("Please enter the elements of the array: ");
		for (int i = 0; i<array.length; i++) { array[i] = scan.nextInt();}
		scan.close();

		for (int i = 0; i<array.length; i++) {
			if (i % 5 != 0 && i % 2 != 0 && i % 3 != 0) {
				sum = sum + array[i];
				s = s + i + " ";
				System.out.println(s);

			}
		}System.out.println("Sum of numbers with simple index numbers: " + sum);
	}

}
