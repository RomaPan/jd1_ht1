package by.htp.les02.main;

import java.util.Scanner;

public class HomeworkTask31 {
//  31.  ��������� ��������� ��� ���������� ����, ����������� ������, ���� �� �������� �
//	������� ���� v ��/�, �������� ������� ���� v1 ��/�, ����� �������� �� ����� t1 �, � ������
//	������� ���� � t2 �.
	public static void main(String[] args) {
		int v;
		int v1;
		int t1;
		int t2;
		
		int lakeDistance;
		int riverDistance;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter boat speed in still water: ");
		v = scan.nextInt();
		System.out.print("Please enter river flow speed: ");
		v1 = scan.nextInt();
		System.out.print("Please enter boat travel time in still water in hours.: ");
		t1 = scan.nextInt();
		System.out.print("Please enter boat travel time up the river stream in hours: ");
		t2 = scan.nextInt();
		
		scan.close();
		
		lakeDistance = v * t1;
		riverDistance = (v - v1) * t2;
		
		System.out.println("Distance of the boat in still water is: " + lakeDistance);
		System.out.println("Distance of the boat up the river stream is: " + riverDistance);
			
		

	}

}
