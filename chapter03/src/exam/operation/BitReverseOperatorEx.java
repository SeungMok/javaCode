package exam.operation;

public class BitReverseOperatorEx {
	public static void main(String[] args0) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		
		for(int i = 0 ; i < 32 ; i = i + 4) {
			System.out.print(Integer.toBinaryString(v2).substring(i,i+4)+" ");
	}
		System.out.println();
		System.out.println(Integer.toBinaryString(v2) + "(십진수 : "+ v2 +")");
		System.out.println(Integer.toBinaryString(v3) + "(십진수 : "+ v3 +")");
	}
}
