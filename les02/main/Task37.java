package by.htp.les02.main;

/* Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа: первое число
получили путем написания сначала числа А, затем В. Для получения второго числа сначала записали
число В, затем А. Найти числа А и В если известно , что первое четырехзначное число нацело делится
на 99, а второе на 49.
 */

public class Task37 {

	public static void main(String[] args) {
		int i;
		int j;

		for (i = 10; i < 100; i++) {

			for (j = 10; j < 100; j++) {

				int v1 = 100 * i + j;
				int v2 = 100 * j + i;

				if ((v1 % 99) == 0) {
					System.out.println(v1);
				}
				if ((v2 % 49) == 0) {
					System.out.println(v2);
				}
			}
		}
	}

}
