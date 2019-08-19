package by.htp.les01.main;

//Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.

import static java.lang.Math.sqrt;

public class Task11 {

	public static void main(String[] args) {

		int a = 2;
		int b = 4;

		double c;
		double p;
		double s;

		c = sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		p = a + b + c;
		s = (a * b) / 2;

		System.out.println("периметр = " + p);
		System.out.println("площадь = " + s);
	}

}
