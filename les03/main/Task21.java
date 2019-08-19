package by.htp.les03.main;

//Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». В
//зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		System.out.println(">");
		char x;

		Scanner sc = new Scanner(System.in);
		char d;
		char m;

		System.out.println("> ");
		d = (char) sc.nextInt();
		m = (char) sc.nextInt();

		if (d) {
			System.out.println("девочка!");
		}
		if (m) {
			System.out.println("мальчик!");
		}

	}
}
