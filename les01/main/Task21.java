package by.htp.les01.main;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.

public class Task21 {

	public static void main(String[] args) {

		double R;

		R = 222.333;

		R = (int) R / 1000.0 + ((R - (int) R) * 1000);

		System.out.println(R);
	}

}
