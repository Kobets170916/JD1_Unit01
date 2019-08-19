package by.htp.les01.main;

//Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r)

public class Task23 {

	public static void main(String[] args) {

		double R;
		double r;
		double S;

		R = 7;
		r = 4;

		S = Math.PI * (Math.pow(R, 2) - Math.pow(r, 2));

		System.out.println(S);

	}

}
