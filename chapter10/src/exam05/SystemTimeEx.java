package exam05;

public class SystemTimeEx {
	public static void main(String[] args) {
		long start_time = System.nanoTime();
		
		int sum = 0;
		for(int i = 1 ; i <= 1000000; i++) {
			sum += i;
		}
		
		long end_time = System.nanoTime();
		
		System.out.println("1~1000000 까지의 합 : " + sum);
		System.out.println("걸린시간 : "+(end_time-start_time)/1000000000.0+"초");
	}

}
