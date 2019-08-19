package by.htp.les02.main;

//Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)

public class Task16 {

	public static void main(String[] args) {

		int sum = 1;
		double res = 1;
		int i = 2;

		while (i < 11) {
			sum += i;
			res *= sum;
			i++;
			System.out.println(res);
		}
	}
}
