package exam.operation;

public class IncDecOpEx {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int result;
		
		System.out.println("x = 10"
				+ "");
		result = x++;
		System.out.println("(result = x++)\nresult = "+result);
		result = ++x;
		System.out.println("(result = ++x)\nresult = "+result);

	}
}
