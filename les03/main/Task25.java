package by.htp.les03.main;

/*
Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение
«Пожароопасная ситуация », если температура в комнате превысила 60° С.
*/
import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int p;

		System.out.println("> ");
		p = sc.nextInt();

		if (p >= 60) {
			System.out.println("Пожароопасная ситуация ");
		}
	}
}
