package by.htp.les04.main;

public class HomeworkTask13 {
//	13. ��������� ������� �������� ������� y = 5 - x2/2 �� ������� [-5; 5] � ����� 0.5
	public static void main(String[] args) {
		float x = -5;
		float y;
		
		while (x <= 5) {
			y = 5 - x*x/2;
			System.out.println("x = " + x + " " + "y = " + y);
			x = x + 0.5f;
			
		}

	}

}
