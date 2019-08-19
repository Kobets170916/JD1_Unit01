package by.htp.les03.main;

//аны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d —
//c).
import java.util.Scanner;

public class Task28 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int d;
		int c;

		System.out.println("> ");
		a = sc.nextInt();
		b = sc.nextInt();
		d = sc.nextInt();
		c = sc.nextInt();

		if (d == a) {
			System.out.println("d = a");
		} else if (d != a) {
			System.out.println(Math.max(d, a));
		} else if (d == b) {
			System.out.println("d = b");
		} else if (d != b) {
			System.out.println(Math.max(d, b));
		} else if (d == c) {
			System.out.println("d = c");
		} else if (d != c) {
			System.out.println(Math.max(d, c));
		}
	}

}
