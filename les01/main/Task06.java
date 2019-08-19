package by.htp.les01.main;

// Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах,
//если в каждом большом бидоне на 12 л. больше, чем в малом?
		
public class Task06 {

	public static void main(String[] args) {

		int n = 4;
		int m = 6;

		int a = 80;
		int b = (a / n + 12) * m;

		System.out.println(b);

	}

}