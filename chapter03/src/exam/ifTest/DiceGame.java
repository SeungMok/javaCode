package exam.ifTest;

import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		// 선언
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("몇판 하실레요 ? ");
		int total = scan.nextInt();

		for (int i = 0; i < total; i++) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println("숫자 맞추기 게임 (1~6사이 숫자를 입력하세요) : ");
			int input_num = scan.nextInt();

			if (input_num > 6 || input_num < 1)
				System.out.println("범위내의 숫자를 입력하세요.");
			else {
				if (input_num == num) {
					System.out.println("주사위 숫자 : " + num + "\n내가 고른 숫자 : " + input_num + "\n축하합니다 정답!");
					count++;
				}
				else
					System.out.println("주사위 숫자 : " + num + "\n내가 고른 숫자 : " + input_num + "\n아쉽네요 다음 기회에");
			}
		}
		System.out.println("맞춘횟수 : "+count+"  ("+count+"/"+total+")");
	}
	
}
