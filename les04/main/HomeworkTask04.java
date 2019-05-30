package by.htp.les04.main;

public class HomeworkTask04 {

	public static void main(String[] args) {
//		4. С помощью оператора while напишите программу вывода всех четных чисел в диапазоне
//		от 2 до 100 включительно.
		
		int i = 2;
		
		while(i >=2 && i <= 100) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
				
			}
			i++;
		}
		
	}

}
