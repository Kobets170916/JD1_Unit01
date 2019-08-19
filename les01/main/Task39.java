package by.htp.les01.main;

// Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения,
//сложения и вычитания, вычислите за минимальное число операций

public class Task39 {

	public static void main(String[] args) {
		int x = 6;
		double y;
		y = 2 * Math.pow(x, 4) - 3 * Math.pow(x, 3) + 4 * Math.pow(x, 2) - 5 * x + 6;
		System.out.println(y);
		
	}

}
