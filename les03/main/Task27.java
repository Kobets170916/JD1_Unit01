package by.htp.les03.main;

//Найти max{min(a, b), min(c, d)}.

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int d;
		int c;

		System.out.println("> ");
		a = sc.nextInt();
		b = sc.nextInt();
		d = sc.nextInt();
		c = sc.nextInt();

		int ab = Math.min(a, b);
		int cd = Math.min(c, d);

		System.out.println(Math.max(ab, cd));

	}

}
