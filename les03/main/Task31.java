package by.htp.les03.main;

import java.util.Scanner;

// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.

public class Task31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A;
		int B;
		int x;
		int y;
		int z;

		System.out.println( ">" );
		A = sc.nextInt();
		B = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();

		if (A > y && B > x || A > x && B > y) {
			System.out.println("пройдет");
		}
		else if (A > z && B > x || A > x && B > z) {
			System.out.println("пройдет");
		}
		else if (A > y && B > z || A > z && B > y) {
			System.out.println("пройдет");
		} else {
			System.out.println("не пройдет");
		}
	}

}

