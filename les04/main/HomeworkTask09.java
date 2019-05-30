package by.htp.les04.main;

public class HomeworkTask09 {
//	9. Найти сумму квадратов первых ста чисел.
	public static void main(String[] args) {
		double i = 1;
		double sum = 0;
		
		while (i <= 100) {
			sum = sum + Math.pow(i, 2);
			i++;
			System.out.println(" " + sum);
		}

	}

}
