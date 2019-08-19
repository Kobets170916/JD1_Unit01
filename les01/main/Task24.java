package by.htp.les01.main;

// Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.

public class Task24 {

	public static void main(String[] args) {

		double a;
		double b;
		double alpha;
		double S;

		a = 6;
		b = 4;

		alpha = Math.PI / 4;

		S = (a + b) * (a - b) * Math.tan(alpha) / 4;

		System.out.println(S);

	}

}
