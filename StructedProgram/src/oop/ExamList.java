package oop;

import java.util.Scanner;

public class ExamList {
	Exam[] score;
	private int current;
	
	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public ExamList(Exam[] score, int current) {
		super();
		this.score = score;
		this.current = current;
	};
	
	void inputScore(Scanner scan) {

			System.out.println("┌───────────────────────────┐");
			System.out.println("│           성적  입력                      │");
			System.out.println("└───────────────────────────┘");
			System.out.println();

			
			for(int i = 0 ; i < this.score.length; i++) {
				score[i] = new Exam();
				System.out.printf("국어%d : ", i + 1);
				score[current].setKors(scan.nextInt());
				if (score[current].getKors() < 0 || 100 < score[current].getKors())
					System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

				System.out.printf("수학%d : ", i + 1);
				score[current].setMaths(scan.nextInt());
				if (score[current].getMaths() < 0 || 100 < score[current].getMaths())
					System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");

				System.out.printf("영어%d : ", i + 1);
				score[current].setEngs(scan.nextInt());
				if (score[current].getEngs() < 0 || 100 <score[current].getEngs() )
					System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");
				
				System.out.printf("컴퓨터%d : ", i + 1);
				score[current].setComs(scan.nextInt());
				if (score[current].getComs() < 0 || 100 <score[current].getComs() )
					System.out.println("컴퓨터성적은 0~100까지의 범위만 입력이 가능합니다.");
				this.current++;
				
				System.out.println("학생 추가입력 ? (y/n)");
				String yn = scan.next();
				if(yn.equals("N") || yn.equals("n"))
					break;
				if(current >= 3) {
					Exam temp[] = new Exam[score.length + 3];
					for(int j = 0 ; j < score.length; j++) {
						temp[j] = score[j];
					}
					this.score = temp;
				}
			}
			System.out.println("─────────────────────────────");
	 }
}
