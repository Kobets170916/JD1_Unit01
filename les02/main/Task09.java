package by.htp.les02.main;

//Найти сумму квадратов первых ста чисел

public class Task09 {
	public static void main(String[] args) {

		int a = 1;

		double sum = 0;

		for (a = 1; a <= 100; a++) {
			sum = sum + Math.pow(a, 2);
			System.out.println(sum);

		}
	}

}
