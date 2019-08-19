package by.htp.les03.main;

//Составить программу, которая определит площадь какого круга меньше

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int s1;
		int s2;

		System.out.println("> ");

		s1 = sc.nextInt();
		s2 = sc.nextInt();

		if (s1 > s2) {
			System.out.println("s2 меньше");

		} else {
			System.out.println("s1 меньше");
		}
	}

}
