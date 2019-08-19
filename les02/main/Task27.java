package by.htp.les02.main;

// Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и
//самого числа. m и n вводятся с клавиатуры.

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int m;
		int n;

		System.out.println("> ");
		m = sc.nextInt();
		n = sc.nextInt();

		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= i; j++) {
				if (n % j == 0) {
					System.out.print(j + "");
					n = n / j;
				}

			}
		}
	}
}
