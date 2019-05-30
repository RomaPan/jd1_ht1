package by.htp.les06.main;

public class HomeworkTask10 {
//	10. Ќаписать метод(методы) дл€ вычислени€ суммы факториалов всех нечетных чисел от 1 до 9
	public static void main(String[] args) {
		int s;
		
		s = sumFactorialNumbers(1, 9);
		
		System.out.println("Factorial sum of odd numbers in range from 1 to 9 is = " + s);
		

	}
	
	public static int sumFactorialNumbers(int from, int until) {
		int fact = 0;
		int sum = 0;
		for (int i = from; i <= until; i = i + 2 ) {
			for (int j = 1; j <= i; j++) {
				fact = fact*j;
			}
			sum = sum + fact;
			fact = 1;
		}
		return sum;
	}

}
