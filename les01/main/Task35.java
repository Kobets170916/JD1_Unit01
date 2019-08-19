package by.htp.les01.main;

//Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.

public class Task35 {
	public static void main(String[] args) {

		double M = 253;
		double N = 125;

		double x;
		double y;

		x = (M / N) % 10;

		y = (10 * (M % N) / N);

		System.out.println("старшая " + (M / N) + " = " + y);

		System.out.println("младшая " + (M / N) + " = " + (long) x);

	}

}
