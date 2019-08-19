package by.htp.les03.main;

//Вычислить значение функции:

public class Task40 {

	public static void main(String[] args) {

		double x = 5;
		double y;

		if (x <= 13) {
			y = Math.pow(-x, 3) + 9;

			System.out.println("F(x) = " + y);
		}

		else if (x > 13) {
			y = -(3 / x + 1);
			System.out.println("F(x) = " + y);

		}

	}

}
