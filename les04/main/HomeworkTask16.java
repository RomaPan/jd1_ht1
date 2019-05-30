package by.htp.les04.main;

public class HomeworkTask16 {
//	16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)
	public static void main(String[] args) {
		double mult;
		double num1;
		
		
		num1 = 3;
		mult = 3;
		
		for (int i = 2; i <= 10; i++) {
			num1 = num1 + i + 1;
			mult = mult * num1;
			System.out.print(mult + " ");
		}

	}

}
