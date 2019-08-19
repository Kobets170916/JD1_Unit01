package by.htp.les03.main;

//Вычислить значение функции:

public class Task39 {

	public static void main(String[] args) {

		double x = 5;
		double y;

		if (x >= 8) {
			y = Math.pow(-x, 2) + x - 9;

			System.out.println("F(x) = " + y);
		}

		else if (x < 8) {
			y = 1 / (Math.pow(x, 4) + 6);
			System.out.println("F(x) = " + y);

		}

	}
}