package by.htp.les02.main;

// В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, то
//получили исходное число. Найти это число.

public class Task39 {

	public static void main(String[] args) {
		int a;

		for (a = 100; a <= 999; a++) {
			int b = a - (a % 10);
			int c = b * 7;
			if (c == a) {
				System.out.println(a);
			}

		}
	}
}
