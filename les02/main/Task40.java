package by.htp.les02.main;

import java.util.Scanner;

//Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои
//цифры.
public class Task40 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("> ");
		n = sc.nextInt();
		int b = n % 10;
		int c = (n / 10) % 10;
		int d = (n / 100) % 10;

		int i;

		for (i = 1; i < n; i++) {

			if (i % b == 0) {
				if (i % c == 0) {
					if (i % d == 0) {
						System.out.println(i);
					}
				}
			}
		}
	}
}
