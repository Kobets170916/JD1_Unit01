package by.htp.les01.main;

//Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций.

public class Task40 {

	public static void main(String[] args) {
		int x = 5;
		double y1;
		double y2;

		y1 = -2 * x + 3 * Math.pow(x, 2) - 4 * Math.pow(x, 3);
		y2 = 2 * x + 3 * Math.pow(x, 2) - 4 * Math.pow(x, 3);

		System.out.println("y1 = " + y1 + ", y2 = " + y2);
	}
}
