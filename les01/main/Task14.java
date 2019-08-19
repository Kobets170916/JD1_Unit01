package by.htp.les01.main;

//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R

public class Task14 {

	public static void main(String[] args) {

		int r = 3;

		double c;
		double a;

		c = 2 * Math.PI * r;

		a = Math.PI * Math.pow(r, 2);

		System.out.println("���������� = " + c);
		System.out.println("������� = " + a);
	}

}
