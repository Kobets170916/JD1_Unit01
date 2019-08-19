package by.htp.les03.main;

// На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком
//координатном угле)

import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		int y;

		System.out.println("> ");
		x = sc.nextInt();
		y = sc.nextInt();

		if (x == 0 && y == x) {
			System.out.println("0");
		} else if (x == 0 && y != 0) {
			System.out.println("ось Y");
		} else if (x != 0 && y == 0) {
			System.out.println("ось X");
		} else if (x > 0 && y > 0) {
			System.out.println("I четверть");
		} else if (x < 0 && y > 0) {
			System.out.println("II четверть");
		} else if (x < 0 && y < 0) {
			System.out.println("III четверть");
		} else {
			System.out.println("IV четверть");
		}
	}
}
