package by.htp.les02.main;

/*Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать
его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным
числом.*/

public class Task24 {

	public static void main(String[] args) {

		int a = 1685965;
		int sum = 0;

		for (int i = 1; i < 5; i++) {
			int d = a % 10;
			a /= 10;
			if (i % 2 == 0) {
				sum += d;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			if (a / (int) Math.pow(10, i) == 0) {
				int razriad = i;
				break;
			}
			System.out.println(i);
		}
		System.out.println(sum);

	}
}
