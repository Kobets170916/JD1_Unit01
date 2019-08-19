package by.htp.les03.main;

import java.util.Scanner;

//Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них
//положительной.

public class Task32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;

		System.out.println("- ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a + b > 0 || a + c > 0 || c + b > 0) {
			System.out.println("+");
		} else if (a + b < 0 || a + c < 0 || c + b < 0) {
			System.out.println("-");
		}

	}

}
