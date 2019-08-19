package by.htp.les01.main;

//Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба
public class Task18 {

	public static void main(String[] args) {

		int h = 3;
		int a1 = 2;
		int a2 = 3;

		double s1 = Math.pow(h, a1);

		double s2 = 6 * s1;

		double v = Math.pow(h, a2);

		System.out.println("площадь грани: " + s1);
		System.out.println("площадь полной поверхности: " + s2);
		System.out.println("объем этого куба: " + v);

	}
}
