package by.htp.les02.main;

/*Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
значения функции:*/

public class Task21 {

	public static void main(String[] args) {

		System.out.println("|    x - sin(x)          ||       F(x)       |");
		double a;
		double b;
		double h;

		double y;

		a = 5;
		b = 8;
		h = 1;

		for (double x = a; x <= b; x = x + h) {
			y = x - Math.sin(x);

			System.out.println("|" + x + Math.sin(x) + "||" + y + "|");

		}

	}

}
