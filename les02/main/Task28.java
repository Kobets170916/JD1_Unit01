package by.htp.les02.main;

/*Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить
результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а
также на ввод Y=0 при делении. Организовать возможность многократных вычислений без
перезагрузки программа (т.е. построить цикл). В качестве символа прекращения вычислений принять
‘0’.*/

import java.util.Scanner;

public class Task28 {

	public static void main(String[] args) {
		
		int z;	
				
		do {
		
	    Scanner sc = new Scanner(System.in);
	    int x;
		int y;
		char op;
		
		System.out.println("> ");
		x = sc.nextInt();
		y = sc.nextInt();
		op = sc.next().charAt(0);	

		switch (op) {
		case '+':
			z = x + y;
			System.out.println(z);
			break;
		case '-':
			z = x - y;
			System.out.println(z);
			break;			
		case '*':
			z = x - y;
			System.out.println(z);
			break;
		case '/':
		if (y != 0) {
			System.out.println("�� 0 ������ ������");
		}
		else {
			z = x / y;
			System.out.println(z);
		}
			break;
		default:
				System.out.println("�������� ��� ���");
		}
		
		    int a;
		System.out.println("�������� - ����� 0, ���������� ������ ����� > ");
		a = sc.nextInt();
		
		while(a != 0);
		}
	}

}
