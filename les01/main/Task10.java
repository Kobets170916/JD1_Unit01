package by.htp.les01.main;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)

public class Task10 {
	public static void main(String[] args) {

		int x = 5;
		int y = 8;

		double z;
		z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x) * y;

		System.out.println(z);
	}

}
