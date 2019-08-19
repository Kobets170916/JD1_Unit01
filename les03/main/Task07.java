package by.htp.les03.main;

//Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х

import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;
		int x;
		int m;

		System.out.println("> ");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		x = sc.nextInt();

		m = a * x * x + b * x + c;

		System.out.println(Math.abs(m));
	}
}
