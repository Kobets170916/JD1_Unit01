package by.htp.les02.main;

// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
//равен заданному е. Общий член ряда имеет вид:

public class Task19 {

	public static void main(String[] args) {
		double n;
		double an;
		double e = 0.35;

		double sum = 0;
		for (n = 1;; n++) {
			an = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));

			if (an >= e) {
				sum = sum + an;

				System.out.println(sum);
			} else
				break;
		}
	}
}
