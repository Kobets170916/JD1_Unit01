package by.htp.les01.main;

//Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8 за
//три операции и а10 за четыре операции.

public class Task27 {

	public static void main(String[] args) {

		int a;
		int b;

		a = 2;
		b = a * a; // ^2
		a = b * b; // ^4
		a = a * a; // ^8

		System.out.println("a ^8 = " + a);

		a = a * b; // ^10

		System.out.println("a ^10 = " + a);

	}

}
