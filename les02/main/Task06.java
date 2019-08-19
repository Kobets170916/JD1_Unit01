package by.htp.les02.main;

//Напишите программу, где пользователь вводит любое целое положительное число. А программа
//суммирует все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {

		System.out.print("введи любое целое положительное число: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
