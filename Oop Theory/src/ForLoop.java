import java.util.Scanner;
public class ForLoop {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		int n = sc.nextInt();
		int factorial = 1;
		for(int i = n;i >= 1;i--) {
			factorial = factorial*i;
		}
		System.out.println(factorial);
		
	}
		finally {
			sc.close();
		}
	}

}
