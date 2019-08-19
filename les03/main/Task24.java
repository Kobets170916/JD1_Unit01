package by.htp.les03.main;

// Составить программу, определяющую результат гадания на ромашке — «любит—не любит», взяв за исходное
//данное количество лепестков п.
import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("> ");
		n = sc.nextInt();

		if ((n % 2) == 0) {
			System.out.println("love ");
		} else {
			if ((n % 1) == 0) {
				System.out.println("Love not");
			}
		}
	}

}
