package by.htp.les03.main;

// Составить программу: определения наибольшего из двух чисел а и b.
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		System.out.println("> ");

		a = sc.nextInt();
		b = sc.nextInt();
		if (a < b) {
			System.out.println("наибольшеe b" + b);

		} else if (a == b) {
			System.out.println("a = b");
		} else {
			System.out.println("наибольшеe a" + a);
		}

	}

}
