package by.htp.les03.main;

//Подсчитать количество отрицательных среди чисел а, b, с.

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		// int a, b, c;

		int lenght = 3;
		int CountPOS = 0;
		int CountNEG = 0;

		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;

		System.out.println("> ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int min = 0;
		int plus = 0;
		if (a > 0) {
			plus++;
		} else if (a < 0) {
			min++;
		}
		if (b > 0) {
			plus++;
		} else if (b < 0) {
			min++;
		}
		if (c > 0) {

			plus++;
		} else if (c < 0) {
			min++;
		}
		if (a > 0 && b > 0 && c > 0)
			System.out.println(" 0");
		else
			System.out.println(min);

	}
}