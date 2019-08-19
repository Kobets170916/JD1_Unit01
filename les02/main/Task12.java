package by.htp.les02.main;

//Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу
//нахождения произведения первых 10 членов этой последовательности.
public class Task12 {
	public static void main(String[] args) {

		double n = 1;

		for (n = 1; n <= 10; n++) {

			double p = n * (n - 1) * 6;
			System.out.println(p);

		}
	}

}
