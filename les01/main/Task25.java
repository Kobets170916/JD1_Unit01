package by.htp.les01.main;

//Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с 
//(предполагается, что а≠0 и что дискриминант уравнения неотрицателен)

public class Task25 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double D;

		a = 2;
		b = 24;
		c = 4;

		D = b * b - 4 * a * c;

		if (D > 0) {
			double x1, x2;
			x1 = (-b - Math.sqrt(D)) / (2 * a);
			x2 = (-b + Math.sqrt(D)) / (2 * a);

			System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
		} else if (D == 0) {
			double x;
			x = -b / (2 * a);
			System.out.println("Уравнение имеет единственный корень: x = " + x);
		}

	}

}
