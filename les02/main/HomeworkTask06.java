package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask06 {
	//6. Ќаписать код дл€ решени€ задачи. ¬ 'n' малых бидонах 80 л молока. —колько литров
	// молока в 'm' больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
	public static void main(String[] args) {
		int smallCanAmount;
		double smallCanLitres;
		int largeCanAmount;
		double largeCanLitres;
		double totalAmountOfMilkInLargeCans;

		System.out.print("Please enter the amount of small milk cans (the number must be integer): ");
		Scanner scan = new Scanner(System.in);
		while (!scan.hasNextInt()) {
			System.out.println("Not an integer number, please try again");
			scan.next();
		}
		smallCanAmount = scan.nextInt();
		
		
		System.out.print("Please enter the amount of large milk cans (the number must be integer): ");
		while (!scan.hasNextInt()) {
			System.out.println("Not an integer number, please try again");
			scan.next();
		}
		largeCanAmount = scan.nextInt();
		scan.close();
		
		smallCanLitres = 80 / smallCanAmount;
		largeCanLitres = smallCanLitres + 12;
		totalAmountOfMilkInLargeCans = largeCanAmount * largeCanLitres;
		
		System.out.println("There are " + totalAmountOfMilkInLargeCans + " liters of milk in" + largeCanAmount + " large cans");
		
	}

}
