package by.htp.les03.main;

//Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему
//из исходных, а если равны, то заменить числа нулями.

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m;
		int n;

		System.out.println("> ");
		m = sc.nextInt();
		n = sc.nextInt();

		if (m < n || m > n) {

			System.out.println(m = n = Math.max(m, n));
		} else if (m == n) {
			System.out.println(m = n = 0);
		}

	}

}
