package by.htp.les05.main;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkTask05 {
//	5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных
//	чисел этой последовательности. Если таких чисел нет, то вывести сообщение об этом факте.
	public static void main(String[] args) {
		String evenNumbers = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your sequence of numbers: ");
		String s = scan.nextLine();
		scan.close();
		
		try {
		String [] arrayOfStrings = new String [s.length()];
		arrayOfStrings = s.split(" ");
		
		int [] array = new int [arrayOfStrings.length];
		for (int i = 0; i<arrayOfStrings.length; i++) {
			array[i] = Integer.parseInt(arrayOfStrings[i]);
		}
		for (int i = 0; i<array.length; i++) {
			 if (array[i]% 2 == 0) {
				 evenNumbers = evenNumbers + array[i] + " ";
			 } 
		}
		String [] evenNumbersArray = new String[evenNumbers.length()];
		evenNumbersArray = evenNumbers.split(" ");
		
		int [] evenDigitsArray = new int [evenNumbersArray.length];
		for (int i = 0; i <evenNumbersArray.length; i++) {
			evenDigitsArray[i] = Integer.parseInt(evenNumbersArray[i]);
		}
		System.out.println("even numbers: " + Arrays.toString(evenDigitsArray));
		}
		catch(NumberFormatException e ) {
			System.out.println();
			System.out.println("Array has no even numbers.");
		}
		
	}

}
