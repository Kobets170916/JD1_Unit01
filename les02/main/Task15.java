package by.htp.les02.main;

//Вычислить : 1+2+4+8+...+ 2 в 10 степени.

public class Task15 {
	public static void main(String[] args) {

		int sum = 0;
		for (int j = 2; j <= 1024; j = j + 2) {
			sum = sum + j;
		}
		System.out.println(sum);

	}

}
