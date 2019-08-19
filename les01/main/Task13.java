package by.htp.les01.main;

//Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.

public class Task13 {

	public static void main(String args[]) {

		int x1 = 2;
		int x2 = 6;
		int x3 = 4;
		int y1 = 1;
		int y2 = 3;
		int y3 = 5;

		double a;
		double b;
		double c;

		double p;
		double s;
		double d;

		a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		b = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		c = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));

		p = a + b + c;
		d = p / 2;

		s = Math.sqrt(d * (d - a) * (d - b) * (d - c));

		System.out.println("�������� = " + p);
		System.out.println("������� = " + s);

	}

}
