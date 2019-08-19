package by.htp.les02.main;

/*Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
значения функции:*/

public class Task22 {

	public static void main(String[] args) {

	
		double a;
		double b;
		double h;

		double y;

		a = 3;
		b = 9;
		h = 3;

		for (double x = a; x <= b; x = x + h) {
			y = Math.sin(x) * Math.sin(x);

			System.out.println("|" + Math.pow(Math.sin(x), (2)) + "||" + y + "|");

		}
	}
}
