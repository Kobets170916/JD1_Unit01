package by.htp.les01.main;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)

import static java.lang.Math.sqrt;

public class Task08 {

	public static void main(String[] args) {

		int a = 2;
		int b = 3;
		int c = 4;

		double t2;

		t2 = (b + sqrt(b * b + 4 * a * c)) / (2 * a) - (Math.pow(a, 3) * c + Math.pow(b, -3));

		System.out.println(t2);
	}

}
