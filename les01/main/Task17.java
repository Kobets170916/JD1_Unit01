package by.htp.les01.main;

//Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.
public class Task17 {

	public static void main(String[] args) {

		int a1 = 3;
		int b1 = 3;

		int a2 = 5;
		int b2 = 3;

		Math.abs(a1);
		Math.abs(a2);

		double c = (Math.pow(a1, b1) + Math.pow(a2, b2)) / 2;
		double d = Math.sqrt(Math.abs(a1) * Math.abs(a2));

		System.out.println("среднее арифметическое кубов этих чисел  3, 5: " + c);
		System.out.println("среднее геометрическое модулей чисел 3, 5: " + d);
	}
}