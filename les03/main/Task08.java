package by.htp.les03.main;

//Составить программу нахождения наименьшего из квадратов двух чисел а и b.

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;
		int b;

		System.out.println("> ");

		a = sc.nextInt();
		b = sc.nextInt();

		a = a * a;
		b = b * b;

		System.out.println(Math.min(a, b));

	}
}
