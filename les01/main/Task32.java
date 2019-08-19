package by.htp.les01.main;

//Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). 
//Какое время будут показывать часы через р ч q мин r с?

public class Task32 {

	public static void main(String[] args) {

		int t = 10;
		int n = 40;
		int c = 35;

		System.out.println("Текущее время " + t + ":" + n + ":" + c);

		int p = 2;
		int q = 12;
		int r = 15;

		p += t;
		q += n;
		r += c;

		System.out.println("Текущее время 2 " + p + ":" + q + ":" + r);

	}

}
