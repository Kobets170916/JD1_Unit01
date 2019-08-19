package by.htp.les01.main;

//Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае:
	
public class Task38 {

	public static void main(String[] args) {
		int x = 2;
		int y = 2;
		if((x >= 0) && y >= 0 && (y <= 4 -x) || x < 0 && y >= 0 && y <= 4 + x){
			
			System.out.println("true");
			
		}else {
			System.out.println("false");
		}

	}

}
