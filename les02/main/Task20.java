package by.htp.les02.main;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
//равен заданному е. Общий член ряда имеет вид:
	
public class Task20 {

	public static void main(String[] args) {
		double n;
		double an;
		double e = 0.17;

		double sum = 0;
		for (n = 1;; n++) {
			an = 1 / ((3 * n - 2) * (3 * n + 1));

			if (an >= e) {
				sum = sum + an;

				System.out.println(sum);
			} else
				break;
		}
	}
}
