package by.htp.les03.main;

import java.util.Scanner;

// Вычислить число и месяц в невисокосном году по номеру дня

public class Task35 {

	public static void main(String[] args) {
		int day;
		int month = 0;

		int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		Scanner sc = new Scanner(System.in);
		

		System.out.println("> ");
		day = sc.nextInt();

		while (day > days[month]) {
			day = day - days[month];
			++month;
		}
		System.out.println("Month = " + month + ", day = " + day);
	}

}