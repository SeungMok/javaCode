package exam.operation;

public class InfinityNanCheckEx {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y;
		double z1 = x % y;
		System.out.println(z);
		System.out.println(z+1);
		System.out.println(Double.isInfinite(z));
		System.out.println(z1);
		System.out.println(z1+33);
		
	}
}
