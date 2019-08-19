package by.htp.les02.main;

import java.util.Scanner;

/*Проверить введенную пользователем строку на наличие недопустимых символов. В качестве
первого символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть
буквами, цифрами и знаком подчеркивания.
 */
public class Task32 {

	public static void main(String[] args) {
		
		  System.out.println("введи строку__");
	        while (true) {
	            String str = new Scanner(System.in).nextLine();
	            char[] ch = str.toCharArray();
	            if (check(ch)) {
	                System.out.println("верно");
	                                break;
	            } else {
	                System.out.println("не верно");
	            }
	        }
	    }
	 
	    public static boolean check(char[] ch) {
	        if (ch[ch.length - 1] == 'C' || ch[ch.length - 1] == 'K' || ch[ch.length - 1] == 'F') {
	            for (int i = 0; i < ch.length - 1; i++) {
	                if (!Character.isDigit(ch[i])) {
	                    return false;
	                }
	            }
	            return true;
	        } else {
	            return false;
	        }
	    }
	}

