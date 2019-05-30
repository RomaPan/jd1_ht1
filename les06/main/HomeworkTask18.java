package by.htp.les06.main;



public class HomeworkTask18 {
//	18. Найти все натуральные n-значные числа, цифры в которых образуют строго
//	возрастающую последовательность (например, 1234, 5789). Для решения задачи
//	использовать декомпозицию.
	public static void main(String[] args) {
		int n = 9999;
		
		System.out.print(ascendingDigits(n));
		
	}

	public static String ascendingDigits(int n) {
		String str = "";
		for (int i = 0; i < n; i++) {
			int a = i / 1000;
			int b = i / 100 % 10;
			int c = i / 10 % 10;
			int d = i % 10;
			
			if (a < b && b < c && c < d) {
				str = str + i + " \n";
			}
		}
		return str;
	}
}
