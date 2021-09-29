
public class TernaryOperator {

	public static void main(String[] args) {
		int a = 12 , b = 100 , c =180;
		int result = 0;
		result = a>b?a>c?a:c:b>c?b:c;
		System.out.println("Largest number is :"+result);
	}

}
