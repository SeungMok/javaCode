package exam.operation;

import java.util.Scanner;

public class ContionEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("총점을 입력하세요 : ");
		int sum = scan.nextInt();
		String result;
		
		result = (sum >= 80) ? "합격" : "불합격";
		
		System.out.println(result);
		
	}
}
