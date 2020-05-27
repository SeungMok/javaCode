package exam.operation;

import java.util.Scanner;

public class AppleBox {
	public static void main(String[] args0) {
		//사과 300개 박스 12개
		
		Scanner scan = new Scanner(System.in);
		System.out.print("사과 : ");
		int apple = scan.nextInt();
		System.out.print("박스 : ");
		int box = scan.nextInt();
		
		int apple_in_box = apple/box;
		int rest_apple = apple%box;
		
		System.out.println("상자에 들어가는 사과 갯수 : "+apple_in_box);
		System.out.println("남은 사과의 갯수 : " + rest_apple);
	}
}