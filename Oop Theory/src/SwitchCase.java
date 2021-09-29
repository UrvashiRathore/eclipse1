import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first nu :");
		int a = sc.nextInt();
		System.out.println("Enter second nu :");
		int b = sc.nextInt();
		System.out.println("Enter operation :");
		sc.nextLine();
		char oper = sc.nextLine().charAt(0);
		int result = 0;
		switch(oper) {
		case'+':
			result = a+b;
			System.out.println("the result is "+ result);
			break;
		case'-':
			result = a-b;
			System.out.println("the result is "+ result);
			break;
		case'*':
			result = a*b;
			System.out.println("the result is "+ result);
			break;
		case'/':
			result = a/b;
			System.out.println("the result is "+ result);
			break;
			default :
				System.out.println("the result is "+ result);
				
			
		}
	}

}
