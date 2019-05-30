package by.htp.les04.main;

public class HomeworkTask05 {
//	5. С помощью оператора while напишите программу определения суммы всех нечетных
//	чисел в диапазоне от 1 до 99 включительно.
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while (i<=99) {
			sum = sum + i;
			System.out.println (sum);
			i = i + 2;
		}

	}

}
