package by.htp.les01.main;

//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное
//значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc..

public class Task22 {

	public static void main(String[] args) {

		double T;
		double HH;
		double MM;
		double SS;

		T = 5556;

		HH = T / 3600;
		MM = (T % 3600) / 60;
		SS = ((T % 3600) % 60);

		System.out.println(HH + " ч " + MM + " мин " + SS + " с ");

	}

}
