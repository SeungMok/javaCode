package exam.ch05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		double scoreAv = 1.0;
		int scoreSum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("학생의 수를 입력하시오.");
		int studentNum = sc.nextInt();

		int scores[] = new int[studentNum];

		System.out.println("학생들의 성적을 입력하시오.");
		for (int i = 0; i < studentNum; i++) {
			System.out.print("학생" + (i + 1) + "의 성적 : ");
			scores[i] = sc.nextInt();
			scoreSum += scores[i];
		}

		scoreAv = (double) scoreSum / studentNum;

		System.out.println("성적 평균 : " + scoreAv);
	}
}
