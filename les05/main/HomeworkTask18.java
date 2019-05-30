package by.htp.les05.main;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkTask18 {
//	18*. «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, в
//	которые надо вставить игральные кубики. Но дверь открывается только в том случае, когда
//	в любых трех соседних ячейках сумма точек на передних гранях кубиков равна 10.
//	(Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу, которая
//	разгадывает код замка при условии, что два кубика уже вставлены в ячейки.
	public static void main(String[] args) {
		
		int cubeOne;
		int cubeTwo;
		int cubeThree;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter face values(1 - 6) for two cubes, Sum of two should be no less than 4: ");
		
		cubeOne = scan.nextInt();
		cubeTwo = scan.nextInt();
		
		scan.close();
	
		cubeThree = 10 - (cubeOne + cubeTwo);
		
		if (cubeThree <= 6 && cubeThree > 0 && cubeOne + cubeTwo + cubeThree == 10) {
			
			int [] array = {cubeOne,cubeTwo,cubeThree,cubeOne,cubeTwo,cubeThree,cubeOne,cubeTwo,cubeThree,cubeOne};
			
			System.out.println("Third missing cube face value is: " + cubeThree);
			System.out.println("Lock code sequence is : " +Arrays.toString(array));
		} else {
			System.out.println("Impossible lock combination, sequence has no solution");
		}

	}

}
