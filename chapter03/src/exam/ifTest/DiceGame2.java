package exam.ifTest;

import java.util.Scanner;

public class DiceGame2 {
	public static void main(String[] args) {
		// 선언
		
		Scanner scan = new Scanner(System.in);
		System.out.println("몇번 맞출 때 까지?? ");
		int propose = scan.nextInt();
		int count = 0;
		int total_count = 0;
		
		while(propose != count) {
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
			total_count++;
		}
		
		System.out.println("맞춘횟수 : "+count+"\t" + ((double)count/total_count)*100 +"%("+count+"/"+total_count+")");
	}
	
}
