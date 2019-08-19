package by.htp.les01.main;

//Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2)

public class Task12 {

	public static void main(String[] args) {

		int x1 = 2;
		int x2 = 7;
		int y1 = 1;
		int y2 = 5;

		double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

		System.out.println(a);
	}

}
