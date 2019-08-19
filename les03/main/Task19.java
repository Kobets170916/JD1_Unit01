package by.htp.les03.main;

//Подсчитать количество положительных среди чисел а, b, с

import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;

		System.out.println("> ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
        int min = 0;
        int plus = 0;
        if (a > 0){
            plus++;}
        else if (a < 0 ){
            min++;}
        if (b>0){
            plus++;}
        else if (b<0){
            min++;}
        if (c > 0){

            plus++;}
        else if (c < 0 ){
            min++;}
       
       
        System.out.println(plus);

       if (a > 0&& b > 0 && c > 0)
                
            System.out.println(0);

	}
}