package by.htp.les02.main;

//Для заданного натурального числа определить, образуют ли его цифры арифметическую
//прогрессию. Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.

public class Task38 {

	public static void main(String[] args) {

		int a = 1357;
		int n = a % 10;
		int n1 = (a - n) / 10 % 10;
		System.out.println(n + " " + n1);

		int h = n - n1;
		System.out.println("Step: " + h);
		int z = 0;
		int z1 = 0;
		int y2 = 0;

		while (a > 10) {
			z = a % 10;
			z1 = (a - z) / 10 % 10;
			a = (a - z) / 10;
			if (z - z1 == h) {
				y2 = h;
				System.out.println(a + " " + y2);
			} else {
				y2 = 963;
				System.out.println(a + " " + y2);
			}
		}
	}
}
