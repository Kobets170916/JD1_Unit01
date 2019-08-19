package by.htp.les03.main;

//Вычислить значение функции:

public class Task38 {

	public static void main(String[] args) {

		double x = 5;
		double y;

		if (x >= 0 || x <= 3) {
			y = Math.pow(x, 2);

			System.out.println("F(x) = " + y);
		}

		else if (x > 3 || x < 0) {
			y = 4;
			System.out.println("F(x) = " + y);

		}

	}

}
