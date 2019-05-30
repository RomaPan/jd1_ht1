package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask34 {
//	34. Составить программу, реализующую эпизод применения компьютера в книжном
//	магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем;
//	если сдачи не требуется, печатает на экране «спасибо»; если денег внесено больше, чем
//	необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если денег
//	недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
	public static void main(String[] args) {
		int price;
		int sum;
		int change;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the price of the book and sum of money: ");
		price = scan.nextInt();
		sum = scan.nextInt();
		scan.close();
		
		if (price == sum) {
			System.out.println("Thank you!");
			
		} else if (sum > price) {
			change = sum - price;
			System.out.println("Please take your change = " + change);
		} else if (sum < price) {
			change = Math.abs(price - sum);
			System.out.println("Not enough funds, please add = " + change + " to continue.");
		} 

	}

}
