package exam.operation;

public class SignOperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("+(-100) = " + result1);
		System.out.println("-(-100) = " + result2);

		/* 이건 오류.
		 * short s = 100; 
		 * short result3 = -s;
		 */
	}
}
