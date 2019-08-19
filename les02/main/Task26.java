package by.htp.les02.main;

//Вывести на экран соответствий между символами и их численными обозначениями в памяти
//компьютера (Таблицу ASCII).

public class Task26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 33; i < 126; i++) {
			System.out.println(i + " -> " + (char) i);
		}
	}
}