package by.htp.les02.main;

// С помощью оператора while напишите программу определения суммы всех нечетных чисел в
//диапазоне от 1 до 99 включительно.

public class Task05 {

	public static void main(String[] args) {
		int x = 1;
		int sum = 0;
		
		while (x <= 99) {
			x = x + 2;
			System.out.println(sum);
			sum = sum + 2;
		}
	}

}
