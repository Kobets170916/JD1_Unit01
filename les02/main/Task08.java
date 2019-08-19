package by.htp.les02.main;

// Вычислить значения функции на отрезке [а,b] c шагом h:

public class Task08 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;

		double y;
		double c;

		a = 3;
		b = 9;
		h = 0.4;
		c = 3;

		for (double x = 0; x <= b; x = x + h) {
			if (x == 15) {
				y = (x + c) * 2;

				System.out.println(y);
			} else if (x != 15) {
				y = (x - c) + 6;
				System.out.println(y);

			}
		}
	}
}
