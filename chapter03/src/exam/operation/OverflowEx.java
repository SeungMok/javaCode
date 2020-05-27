package exam.operation;

public class OverflowEx {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int result = x*y;
		System.out.println(result);
		
		byte x1 = 127;
		byte y1 = 1;
		byte resultByte = (byte)(x1+y1);
		System.out.println(resultByte);
	}
}
