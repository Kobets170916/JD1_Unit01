package by.htp.les01.main;
/*. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае:
• Целое число N является четным двузначным числом.
• Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
• Сумма цифр данного трехзначного числа N является четным числом.
• Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п).
• Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
Треугольник со сторонами а,b,с является равнобедренным.
• Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.*/

public class Task37 {

	public static void main(String[] args) {

		int N = 30;
		if ((N % 2) % 10 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		int a = 5875;
		if (a / 1000 + a % 1000 / 100 == a % 100 / 10 + a % 10) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		int b = 235;
		if ((b / 100 + b % 100 / 10 + b % 10) % 2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		int x = 2;
		int y = 3;
		int m = 4;
		int n = 5;
		if (x >= m && x <= n) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		int j = 254;
		int o = j / 100 + j % 100 / 10 + j % 10;
		if (Math.pow(j, 2) == Math.pow(o, 3)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		int a1 = 5;
		int b1 = 6;
		int c1 = 7;
		if (a1 == b1 && b1 == c1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		int t = 123;
		if (t / 100 + t % 100 / 10 == t % 10) {
		} else if (t / 100 + t % 10 == t % 100 / 10) {
		} else if (t % 100 / 10 + t % 10 == t / 100) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
