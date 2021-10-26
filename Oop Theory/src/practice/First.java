package practice;

import java.util.Scanner;

public class First {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		try {
		char a = sc.nextLine().charAt(0);
		System.out.println(a);
		
		}
		finally {
	        sc.close();
	    }
	}

}
