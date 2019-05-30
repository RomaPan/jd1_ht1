package by.htp.les04.main;

public class HomeworkTask11 {
//	11. Составить программу нахождения разности кубов первых двухсот чисел
	public static void main(String[] args) {
		double i = 0;
		double subtraction;
		
		while ( i <= 200 ) {
			subtraction = Math.abs(Math.pow(i, 3) - Math.pow(i+1, 3));
			System.out.println(subtraction);
			i= i + 1;
		}

	}

}
