package by.htp.les02.main;

//Найдите наибольшую цифру данного натурального числа.

public class Task33 {

	public static void main(String[] args) {
		int a = 254;
		int b = a % 10;
		int c = (a / 10) % 10;
		int d = (a / 100) % 10;
		if (b >= c && b > d || b > c && b >= d) {
			System.out.println(b);
		} else {
			if (c > b && c >= d) {
				System.out.println(c);
			} else {
				System.out.println(d);
			}
		}

	}

}
