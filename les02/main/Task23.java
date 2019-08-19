package by.htp.les02.main;

/* Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
значения функции:*/

public class Task23 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double h;

		double y;

		a = 4;
		b = 7;
		h = 0.5;

		for (double x = a; x <= b; x = x + h) {
			y = (1 / Math.tan(x / 3)) + 0.5 * Math.sin(x);

			System.out.println("|" + (1 / Math.tan(x / 3)) + 0.5 * Math.asin(x) + "||" + y + "|");

		}

	}

}
