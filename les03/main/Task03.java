package by.htp.les03.main;

import java.util.Scanner;

// Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», если число а меньше
//3; если больше, то вывести слово «no»
public class Task03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;
		System.out.println("> ");

		a = sc.nextInt();
		if (a < 3) {
			System.out.println("yes");

		} else if (a > 3) {
			System.out.println("no");
		}
	}

}
