package by.htp.les02.main;

// Найдите количество четных цифр данного натурального числа

public class Task35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 0;
	    int n = 5648;
	    while ( n > 0 )
	    {
	        if ( ( n % 10 ) % 2 == 0 )
	            s++;
	        n /= 10;
	        System.out.println(s);
	    }
	}

}
