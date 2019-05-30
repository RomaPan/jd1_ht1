package by.htp.les04.main;


public class HomeworkTask15 {
//	15. Вычислить : 1+2+4+8+...+ 2 в 10 степени
	public static void main(String[] args) {
		int a = 1;
		int sum = 1;
		
		for (int i = 1; i <=10; i++) {
			a = a * 2;
			sum = sum + a;
			System.out.print(sum + " ");
			
		}

	}

}
