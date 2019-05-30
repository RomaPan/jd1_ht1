package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask29 {
// 29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
	public static void main(String[] args) {
		double a;
		double b;
		double c;
				
		double alpha;
		double alphaRad;
		
		double beta;
		double betaRad;
		
		double gammaRad;
		
		double pi;		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter values for <a>,<b> & <c>: ");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		scan.close();
		
		//Сумма углов в треугольнике равна 180 градусам
		pi = Math.PI;
		
		alpha = Math.acos((b*b + c*c - a*a)/(2*b*c));
		alphaRad = (180/pi)*alpha;
		
		beta = Math.acos((a*a +c*c - b*b) / (2*a*c));
		betaRad = (180/pi)*beta;
		
		gammaRad = 180 - (alphaRad + betaRad);
		
		if (alphaRad > 0 || betaRad > 0) {
			System.out.println("Angle alpha = " + Math.round(alphaRad));
			System.out.println("Angle beta = " + Math.round(betaRad));
			System.out.println("Ange gamma = " + Math.round(gammaRad));
		} else {
			System.out.println("Impossible triangle to express, please try again with new values");
		}

	}

}
