package by.htp.les02.main;

//Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n

public class Task14 {

	public static void main(String[] args) {

		int n = 10;

		int sum;

		for (int i = 1; i <= n; i++)
			
		{
			sum = 1 + (1 / n);

			System.out.println(sum);
		}
	}
}
