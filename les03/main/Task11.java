package by.htp.les03.main;

//Составить программу, которая определит площадь какого треугольника больше

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t1;
		int t2;

		System.out.println("> ");

		t1 = sc.nextInt();
		t2 = sc.nextInt();

		if (t1 > t2) {
			System.out.println("t1 больше");

		} else {
			System.out.println("t2 больше");
		}
	}

}
