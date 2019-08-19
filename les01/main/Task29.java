package by.htp.les01.main;

//Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с

public class Task29 {

	public static void main(String args[]) {

		double a;
		double b;
		double c;

		a = 17;
		b = 10;
		c = 15;

		double aa, bb, cc;

		aa = (Math.acos((a * a + c * c - b * b) / (2 * a * c)));
		bb = (Math.acos((a * a + b * b - c * c) / (2 * a * b)));
		cc = (Math.acos((b * b + c * c - a * a) / (2 * c * b)));

		System.out.println("угол в радианах а " + aa);
		System.out.println("b " + bb);
		System.out.println("с " + cc);

		aa *= (180 / Math.PI);
		bb *= (180 / Math.PI);
		cc *= (180 / Math.PI);

		System.out.println("угол а в градусах " + aa);
		System.out.println("b" + bb);
		System.out.println("c" + cc);

	}

}
