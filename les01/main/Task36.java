package by.htp.les01.main;

import java.util.Scanner;

//Найти частное произведений четных и нечетных цифр четырехзначного числа.

public class Task36 {
	
	public static void main(String[] args) {
		
		System.out.println("введи 4х значное число ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int Odd = 0;
        int Even = 0;
        for (int i = 1; i < 5; i++) {
            int d = a % 10;
            a /= 10;
            if (i % 2 == 0) {
            	Even *= d;
            } else {
                Odd *= d;
            }
        }
        System.out.println("частное произведений четных " + Even);
        System.out.println("частное произведений четных " + Odd);
        
    }
}
		
