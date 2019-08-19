package by.htp.les01.main;

// Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.

public class Task33 {

	public static void main(String[] args) {

		char ch = 't';

		int chCode;

		chCode = (int) ch;

		int chNext;
		int chPrev;

		chNext = chCode + 1;
		chPrev = chCode - 1;

		System.out.println((char) chNext);
		System.out.println(ch);
		System.out.println((char) chPrev);

	}

}
