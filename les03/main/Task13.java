package by.htp.les03.main;

//Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к
//началу координат.
import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x1, y1;
		double x2, y2;
		double A;
		double B;

		System.out.println("> ");

		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();

		A = Math.sqrt((x1 * x1) + (y1 * y1));
		B = Math.sqrt((x2 * x2) + (y2 * y2));

		if (A < B) {
			System.out.println("А ближе");
		} else {
			System.out.println("B ближе");
		}
	}
}