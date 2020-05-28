package exam.ch05;

import java.util.Scanner;

public class MainStringArray {
	public static void main(String[] args) {

		int arr[][] = new int[10][3]; // 국 영 수
		int menuNum;
		boolean run = true;

		int sum_korean = 0;
		int sum_english = 0;
		int sum_math = 0;

		double av_korean = 1.0;
		double av_english = 1.0;
		double av_math = 1.0;

		while (run) {
			Scanner sc = new Scanner(System.in);
			System.out.println("========================================");
			System.out.println("메뉴 : 1.학생 점수 입력, 2.성적처리결과리스트, 3.종료");
			System.out.println("========================================");
			System.out.print("메뉴를 선택 >>  ");

			menuNum = sc.nextInt();

			switch (menuNum) {
			case 1:
				for (int i = 0; i < arr.length; i++) {
					System.out.print("학생" + (i + 1) + "의 국어 성적 : ");
					arr[i][0] = sc.nextInt();
					sum_korean += arr[i][0];

					System.out.print("학생" + (i + 1) + "의 영어 성적 : ");
					arr[i][1] = sc.nextInt();
					sum_english += arr[i][1];

					System.out.print("학생" + (i + 1) + "의 수학 성적 : ");
					arr[i][2] = sc.nextInt();
					sum_math += arr[i][2];
					System.out.println(
							"학생" + (i + 1) + "의 국,영,수 성적 : (" + arr[i][0] + "," + arr[i][1] + "," + arr[i][2] + ")");
				}
				break;
			case 2:
				av_korean = sum_korean / 10.0;
				av_english = sum_english / 10.0;
				av_math = sum_math / 10.0;

				System.out.println("국어 총합 : " + sum_korean + " 국어 평균 : " + av_korean);
				System.out.println("영어 총합 : " + sum_english + " 영어 평균 : " + av_english);
				System.out.println("수학 총합 : " + sum_math + " 수학 평균 : " + av_math);
				break;
			case 3:
				System.out.println("종료합니다.");
				run = false;
			default:
				break;
			}
		}
	}
}
