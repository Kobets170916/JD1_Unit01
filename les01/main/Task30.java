package by.htp.les01.main;

// Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.

public class Task30 {

	public static void main(String args[]) {

		int R1 = 12;
		int R2 = 13;
		int R3 = 15;

		int R;
		R = (R1 * R2 * R3) / (R1 + R2 + R3);

		System.out.println(R);

	}

}
