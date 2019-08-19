package by.htp.les01.main;

//Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.

public class Task20 {

	public static void main(String[] args) {

		int l = 10;
		int b = 2;

		double r = l / 2 * Math.PI;

		double s = Math.PI * Math.pow(r, b);

		System.out.println(s);

	}

}
