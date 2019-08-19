package by.htp.les01.main;

//  Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у

public class Task26 {

	public static void main(String[] args) {

		double a;
		double b;
		double y;

		a = 16;
		b = 50;
		y = 50;

		double c;
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.acos(y));

		double A;
		A = (a + Math.asin(y)) / c;

		double S;
		S = ((a * b) / 2) * Math.asin(A);

		System.out.println(S);

	}

}
