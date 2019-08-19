package by.htp.les03.main;

// Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). Если введены
//некорректные данные, то сообщить об этом.
import java.util.Scanner;

public class Task23 {

	public static void main(String[] args) {

		System.out.println(">");
		Scanner sc = new Scanner(System.in);
		int c;
		int m;

		System.out.println("> ");
		c = sc.nextInt();
		m = sc.nextInt();

		if (c >= 1 && c <= 31)

			if (m >= 1 && m <= 12) {
				System.out.println(c + " : " + m);
			} else if (c < 1 && c > 31 || m < 1 && m > 31)
				;
		{
			System.out.println("некорректные данные");
		}
	}
}
