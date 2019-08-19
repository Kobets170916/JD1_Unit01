package by.htp.les03.main;

import java.util.Scanner;

// Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если
//это не так.
public class Task30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;

		System.out.println("> ");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a > b && b > c) {
			int a1 = a + a;
			int b1 = b + b;
			int c1 = c + c;
			System.out.println("a = " + a1 + " b = " + b1 + " c = " + c1);
		}
		if (a < 0 || b < 0 || c < 0) {
			int a2 = Math.abs(a);
			int b2 = Math.abs(b);
			int c2 = Math.abs(c);
			System.out.println("a = " + a2 + " b = " + b2 + " c = " + c2);
		}
	}
}