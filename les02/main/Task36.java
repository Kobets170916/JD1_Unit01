package by.htp.les02.main;

//Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое
//делится на их произведение. Найти эти числа

public class Task36 {

	public static void main(String[] args) {
		int i = 99;
		int j = 99;
		int p;

		for (i = 10; i < 100; i++) {

			for (j = 10; j < 100; j++) {

				p = i * j;

				int v = 100 * i + j;

				if ((v / p) == 0)
					;
				System.out.println(i + ", " + j + ", " + v + ", " + p);
			}
		}
	}
}
