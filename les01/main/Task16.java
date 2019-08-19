package by.htp.les01.main;

//Найти произведение цифр заданного четырехзначного числа.

public class Task16 {

	public static void main(String[] args) {

		int a = 1234;

		System.out.println("������������ ���� ����� 1234 = " + ((a % 10) * (a / 10 % 10) * (a / 100) * (a / 1000)));

	}

}
