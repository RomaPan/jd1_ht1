package by.htp.les04.main;

public class HomeworkTask10 {
//	10. Составить программу нахождения произведения квадратов первых двухсот чисел
	public static void main(String[] args) {
		double i = 0;
		double mult;
		
		while ( i <= 200 ) {
			mult = Math.pow(i, 4);
			System.out.println(mult);
			i= i + 1;
		}

	}

}
