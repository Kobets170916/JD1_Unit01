package by.htp.les03.main;

//Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую
//степень — отрицательные.
import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;

		System.out.println("> ");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a > 0) {
			System.out.println(a * a);
		} else if (a < 0) {
			System.out.println(Math.pow(a, 4));
		}
		if (b > 0) {
			System.out.println(b * b);
		} else if (b < 0) {
			System.out.println(Math.pow(b, 4));
		}
		if (c > 0) {
			System.out.println(c * c);
		} else if (c < 0) {
			System.out.println(Math.pow(c, 4));
		}
	}
}
