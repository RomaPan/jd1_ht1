package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask21 {
//	21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка?
//			Введи Д или М». В зависимости от ответа на экране должен появиться текст «Мне нравятся
//			девочки!» или «Мне нравятся мальчики!»
	public static void main(String[] args) {
		char ch;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Who are you?");
		System.out.print("Please enter your gender <M> for male, <F> for female: ");
		ch = scan.next().charAt(0);
		scan.close();
		
		if (ch == 'F' || ch == 'f') {
			System.out.println("I like girls!");
		} else if (ch == 'm' || ch == 'M') {
			System.out.println("I like boys!");
		} else {
			System.out.println("Sorry, I live in a binary world!");
		}

	}

}
