package by.htp.les01.main;

// Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной
//и описанной окружностей.

public class Task19 {

	public static void main(String[] args) {

		int a = 6;
		int b = 3;
		int c = 2;

		double s = Math.sqrt(b) / 4 * Math.pow(a, c);

		double h = Math.sqrt(b) / 2 * a;

		double R = Math.sqrt(b) / 3 * a;

		double r = Math.sqrt(b) / 6 * a;

		System.out.println("площадь: " + s);
		System.out.println("высота: " + h);
		System.out.println("радиус вписанной окружности: " + r);
		System.out.println("радиус описанной окружности: " + R);

	}

}
