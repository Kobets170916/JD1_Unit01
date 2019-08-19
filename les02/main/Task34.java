package by.htp.les02.main;

//Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.

public class Task34 {

	public static void main(String[] args) {
		
		for (int a = 1000; a <= 9999; a++) {
		
			int b = a / 1000;
			int c = (a % 1000) / 100;
			int d = (a % 100) / 10;
			int x = (a % 100) % 10;
			if ((b + c + d + x) == 15) {
		
				System.out.println(a);
			}
		}
	}
}
