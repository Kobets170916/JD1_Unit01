package by.htp.les02.main;

//Составить программу нахождения разности кубов первых двухсот чисел

public class Task11 {
	public static void main(String[] args) {
		int n = 1;

		for (n = 1; n <= 200; n++) {
			double r = n - (Math.pow(n, 2) + 1);
			System.out.println(r);

		}

	}

}
