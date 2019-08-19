package by.htp.les03.main;

//Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник
//равносторонним.
import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;

		System.out.println("> ");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a == b && a == c) {
			System.out.println("равносторонний");

		} else {
			System.out.println("не равносторонний");
		}
	}

}
