package by.htp.les01.main;

// Составить программу перевода радианной меры угла в градусы, минуты и секунды.

public class Task28 {

	public static void main(String[] args) {

		double a;
		a = 90;

		a = Math.toDegrees(a); // �������
		System.out.println("градусы: " + a);

		a = a * 60; // min
		System.out.println("минуты: " + a);

		a = a * 60; // c
		System.out.println("секунды: " + a);

	}

}
