package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask37 {
//	37. —оставить линейную программу, печатающую значение true, если указанное
//	высказывание €вл€етс€ истинным, и false Ч в противном случае:
//	Х ÷елое число N €вл€етс€ четным двузначным числом.
//	Х —умма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
//	Х —умма цифр данного трехзначного числа N €вл€етс€ четным числом.
//	Х “очка с координатами (х, у) принадлежит части плоскости, лежащей между пр€мыми х= т, х= п (т<п).
//	Х  вадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
//	Х “реугольник со сторонами а,b,с €вл€етс€ равнобедренным.
//	Х —умма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
//	Х «аданное число N €вл€етс€ степенью числа а (показатель степени может находитьс€ в диапазоне от 0 до 4).
//	Х √рафик функции у = ах2 + bх+ с проходит через заданную точку с координатами (m,п).
	public static void main(String[] args) {
		int number;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		int sumOne;
		int sumTwo;
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer number: ");
		number = scan.nextInt();
		scan.close();
		
        
		//÷елое число N €вл€етс€ четным двузначным числом.
		if (number < 100 && number % 2 == 0 && number > 9) {
			System.out.println("true - 1");
		} else {
			System.out.println("false - 1.2");
		}
		
					
		//—умма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
		if (number > 999 && number <10000) {
			firstDigit = number / 1000;
			secondDigit = number / 100 % 10;
			thirdDigit = number / 10 % 10;
			fourthDigit = number % 10;
			sumOne = firstDigit + secondDigit;
			sumTwo = thirdDigit + fourthDigit;
			if (sumOne == sumTwo) {
				System.out.println("true - 2");
			} else {
				System.out.println("false - 2.1");
			}
		}else {
			System.out.println("false - 2.2");
		}
		
		
        // —умма цифр данного трехзначного числа N €вл€етс€ четным числом.
		if (number > 99 && number < 999) {
			firstDigit = number / 100;
			secondDigit = number / 10 % 10;
			thirdDigit = number % 10;
			sumOne = firstDigit + secondDigit + thirdDigit;
			if (sumOne % 2 == 0) {
				System.out.println("true - 3");
			} else {
				System.out.println("false - 3.1");
			}
		} else {
			System.out.println("false - 3.2");
		}
		
	
		//“очка с координатами (х, у) принадлежит части плоскости, лежащей между пр€мыми х= т, х= п (т<п).
		if (number > 999 && number < 10000) {
			firstDigit = number / 1000;
			secondDigit = number / 100 % 10;
			thirdDigit = number / 10 % 10;
			fourthDigit = number % 10;
			if (firstDigit <= thirdDigit && secondDigit <= fourthDigit ) {
				System.out.println("true - 4");
			} else {
				System.out.println("false - 4.2");
			}
		} else {
			System.out.println("false - 4.1");
		}
		
		// вадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
		if (number > 99 && number < 999) {
			firstDigit = number / 100;
			secondDigit = number / 10 % 10;
			thirdDigit = number % 10;
			if (number*number == Math.pow((firstDigit + secondDigit + thirdDigit), 3) ) {
				System.out.println("true - 5");
			} else {
				System.out.println("false - 5.2");
			}
		} else {
			System.out.println("false - 5.1");
		}
		
		//“реугольник со сторонами а,b,с €вл€етс€ равнобедренным.
		if (number > 99 && number < 999) {
			firstDigit = number / 100;
			secondDigit = number / 10 % 10;
			thirdDigit = number % 10;
			if (firstDigit == secondDigit && secondDigit == thirdDigit) {
				System.out.println("true - 6");
			}
		} else {
			System.out.println("false - 6.1");
		}
		
		//—умма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
		if (number > 99 && number < 999) {
			firstDigit = number / 100;
			secondDigit = number / 10 % 10;
			thirdDigit = number % 10;
			if (firstDigit + secondDigit == thirdDigit || firstDigit + thirdDigit == secondDigit || secondDigit + thirdDigit == firstDigit) {
				System.out.println("true - 7");
			}	
		} else {
			System.out.println("false - 7.1");
		}
		//«аданное число N €вл€етс€ степенью числа а (показатель степени может находитьс€ в диапазоне от 0 до 4).
		if (number >= 0 && number <= 4) {
			System.out.println("true - 8");
		} else {
			System.out.println("false - 8.1");
		}
		
		//√рафик функции у = ах2 + bх+ с проходит через заданную точку с координатами (m,п).

	}

}
