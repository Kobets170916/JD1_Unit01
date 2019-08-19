package by.htp.les03.main;

//Написать программу нахождения суммы большего и меньшего из трех чисел.

import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;

		System.out.println("> ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int s1 = Math.max(Math.max(a, b), c);
		int s2 = Math.min(Math.min(a, b), c);

		System.out.println(s1 + s2);
	}

}
