package by.htp.les03.main;

//Определить, делителем каких чисел а, b, с является число k

import java.util.Scanner;

public class Task20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int k;

		System.out.println("> ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		k = sc.nextInt();

		if (a % k == 0) {
			System.out.println("k делитель a");
		}
		if (b % k == 0) {
			System.out.println("k делитель b");
		}
		if (c % k == 0) {
			System.out.println("k делитель c");
		}
	}

}
