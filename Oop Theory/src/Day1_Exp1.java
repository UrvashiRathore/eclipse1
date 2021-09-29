
public class Day1_Exp1 {

	public static void main(String[] args) {
		int n=10;
		int stu[]=new int[n];
			stu[0] = 49;
			stu[1] = 50;
			stu[2]=57;
			stu[3]=74;
			stu[4]=59;
			stu[5]=72;
			stu[6]=85;
			stu[7]=93;
			stu[8]=79;
			stu[9]=90;
			char a = 1,b = 2,c = 3;
		int result = 0;
		result = stu[n] > 75 ? a : stu[n] > 50 ? b: c;
		switch(result) {
		case'a':
			System.out.println("the result is merit");
			break;
		case'b':
			System.out.println("the result is pass ");
			break;
		case'c':
			
			System.out.println("the result is fail");
			break;
}
}
}