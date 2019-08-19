package by.htp.les02.main;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа

public class Task29 {

	public static void main(String[] args) {
		
		int a = 123456;
		int b = 456712;
		int n= 0;
		int m= 0;
		
		while (a > 0) {
			n = a % 10;
			a = (a - n) / 10;
			System.out.println("a " + n);
			
			int bTemp = b; 
			while (bTemp > 0) {
				m = bTemp % 10;
				bTemp = (bTemp - m) / 10;
				System.out.println("b " + m);
				if (n == m) {
					System.out.println(n);
				}
			}
		}

	}

}
