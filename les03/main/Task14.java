package by.htp.les03.main;

import java.util.Scanner;

//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он
//прямоугольным.

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A;
		int B;
		// int c;

		System.out.println("> ");

		A = sc.nextInt();
		B = sc.nextInt();
		// c = sc.nextInt();

		if ((A + B) < 180) {
			System.out.println("существует");
		} else {
			System.out.println("не существует");

		}
	}

}
