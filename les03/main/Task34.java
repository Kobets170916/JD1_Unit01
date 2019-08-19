package by.htp.les03.main;

/*Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер
запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране
«спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если
денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.*/
import java.util.Scanner;

public class Task34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k;
		int d;

		System.out.println("стоимость книг  > ");
		k = sc.nextInt();
		System.out.println("суммa денег, внесенная покупателем> ");
		d = sc.nextInt();

		if (k == d) {
			System.out.println("спасибо");
		} else if (k < d) {
			System.out.println("возьмите сдачу " + (d - k));
		} else if (k > d) {
			System.out.println("недостаточно " + (k - d));
		}
	}
}