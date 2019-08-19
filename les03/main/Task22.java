package by.htp.les03.main;

//Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.

import java.util.Scanner;

public class Task22 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		int y;

		System.out.println("> ");
		x = sc.nextInt();
		y = sc.nextInt();

		if (x > y) {
			System.out.println("x > y = " + x);
		}

		else if (x < y) {
			int x1;
			x1 = y;
			y = x;
			//
			System.out.println("x = " + x1 + ", y = " + y);

		}

	}

}
