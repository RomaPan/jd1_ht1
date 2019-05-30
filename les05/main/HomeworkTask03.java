package by.htp.les05.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkTask03 {
//	3. ƒана последовательность целых чисел а1 а2,..., аn . ¬ы€снить, какое число встречаетс€
//	раньше - положительное или отрицательное.
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the number of elements in the sequence - N : ");
		int [] array = new int [scan.nextInt()];
		scan.close();

			Random rand = new Random();
			for (int i = 0; i < array.length; i++) {
				array[i] = rand.nextInt(100 +(- 50));
			}
			if ( array [0] < 0) {
				System.out.println("Array starts with a negative number");
			} else {
				System.out.println("Array starts with a positive number");
			}			
			System.out.println(Arrays.toString(array));

	}

}
