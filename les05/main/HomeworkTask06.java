package by.htp.les05.main;

import java.util.Scanner;

public class HomeworkTask06 {
//	6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси,
//	содержащую все эти числа.
	public static void main(String[] args) {
		int [] array;
		int maxI;
		int minI;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter length of the array: ");
		array = new int [scan.nextInt()];
		
		System.out.print("Please enter the elements of the array inline: ");
		for (int i = 0; i<array.length; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();
		
		//module = max[i] - min[i]
		
		maxI = 1;
		minI = 0;
		
		for (int i = 0; i < array.length; i++) {
			if ( array[i] > maxI ) {
				maxI = array[i];
				System.out.println(maxI);
			}
			if (array[i] < minI) {
				minI = array[i];
				System.out.println(minI);
			}
		}
		System.out.println("Shortest length: " + (maxI - minI));
	}

}
