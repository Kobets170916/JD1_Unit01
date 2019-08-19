package by.htp.les03.main;

// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

import java.util.Scanner;

public class Task29 {

	public static void main(String[] args) {
		System.out.println("A(x1, y1), B(x2, y2), C(x3, y3): ");

		Scanner sc = new Scanner(System.in);
		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;

		System.out.println("> ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		x3 = sc.nextInt();
		y3 = sc.nextInt();

		if (((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) == 0) {
			System.out.println("на одной прямой");
		} else {
			System.out.println("не на одной прямой");
		}
	}
}
