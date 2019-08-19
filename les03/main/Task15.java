package by.htp.les03.main;

//Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их
//суммы, а большее — их удвоенным произведением.

import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		int y;

		System.out.println("> ");
		x = sc.nextInt();
		y = sc.nextInt();

		if (x > y) {

			System.out.println(x * y * 2);

		} else if (x < y) {

			System.out.println((x + y) / 2);
		}
	}
}
