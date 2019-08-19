package by.htp.les02.main;

import java.util.Scanner;
/*Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их
угадать. Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала
программа, а также ошибочные числа пользователя*/

public class Task31 {
	public static void main(String[] args) {
		double a = 1;
		while (a <= 5) {
		a = 1 + Math.random() + 15;
		
		System.out.println(a);
		
		Scanner sc = new Scanner(System.in);
		int b;
		
		System.out.println("введи число > ");
		b = sc.nextInt();
		
		if (a == b) {
			System.out.println(b +" - угадал! " + "правильный ответ - " + a);
			}else if(a != b) {
			System.out.println(b +" - не угадал! " + "правильный ответ - " + a);
			
			}	}
			a++;
		}}