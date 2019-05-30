package by.htp.les03.main;

import java.util.Scanner;

public class HomeworkTask14 {
//	14. Даны два угла треугольника (в градусах). Определить, существует ли такой
//	треугольник, и если да, то будет ли он прямоугольным.
	public static void main(String[] args) {
		int alpha;
		int beta;
		int gamma;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter values for angles Alpha and Beta in degrees: ");
		alpha = scan.nextInt();
		beta = scan.nextInt();
		scan.close();
		
		gamma = 180 - (alpha + beta);
		
		System.out.println("Triangle has next angles set: " + alpha + " " + beta + " " + gamma);
		if ( (alpha + beta) > 180 ) {
			System.out.println("This trinalge is an impossible triangle");
		} else if (( alpha + beta ) < 180 ) {
			if (alpha == 90 || beta == 90 || gamma == 90) {
				System.out.println("This triangle is the Right triangle");
			} else {
				System.out.println("This trinagle can exist but is not the Right triangle");
			}
		}
	}

}
