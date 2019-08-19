package by.htp.les02.main;

//Вычислить значения функции на отрезке [а,b] c шагом h:

public class Task07 {
	public static void main(String[] args) {

		double a;
		double b;
		double h;

		double y;

		a = 5;
		b = 8;
		h = 0.6;

		for (double x = 0; x <= b; x = x + h) {
			if (x > 2) {
				y = x;
				System.out.println(y);
			}

			else if (x <= 2) {
				y = -x;
				System.out.println(y);
			}

		}

	}

}
