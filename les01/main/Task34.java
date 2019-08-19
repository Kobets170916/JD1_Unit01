package by.htp.les01.main;

// Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения
//информации.

public class Task34 {

	public static void main(String[] args) {

		double a = 122;

		System.out.println(a + "байт");

		a *= 8;
		System.out.println(a + "бит");

		a /= 1024;
		System.out.println(a + "килобайт");

		a /= 1024;
		System.out.println(a + "мегабайт");

		a /= 1024;
		System.out.println(a + "гигабайт");

		a /= 1024;
		System.out.println(a + "терабайт");

	}

}
