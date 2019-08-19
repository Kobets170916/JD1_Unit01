package by.htp.les02.main;

//Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

public class Task17 {

	public static void main(String[] args) {

		int n = 5;
		double p = 0;
		for (int i = 2; i <= n; i++) {
			p += 1 - 1 / i * i;
		}
		System.out.print(p);
	}
}