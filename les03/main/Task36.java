package by.htp.les03.main;

//Вычислить значение функции:

public class Task36 {

	public static void main(String[] args) {
		
		double x = 5;
		double y;
		
		if (x <= 3) {
				y = Math.pow(x, 2) - 3 * x + 9;

				System.out.println("F(x) = " + y);
			}

			else if (x > 3) {
				y = 1 / (Math.pow(x, 3) + 6);
				System.out.println("F(x) = " + y);
			}
		}

	
}
