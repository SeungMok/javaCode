package com.baniota.Exam;

import java.util.Scanner;

public class StructureProgram {
	static Scanner scan = new Scanner(System.in);
	
    public static void main(String[] args) {
    	
    	ExamList list = new ExamList(new Exam[3], 0);
		int menu;
		boolean keepLoop = true;

		while (keepLoop) {
			printMenu();
			menu = scan.nextInt();
			switch (menu) {
				case 1:
					inputScore(list);
		
					break;
				case 2:
					printScore(list);
					break;
				case 3:
					System.out.println("Bye~~");

					keepLoop = false;
					break;

				default:
					System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");
			}
		}
		scan.close();
	}
    static void printMenu() {
    	System.out.println("┌───────────────────────────┐");
		System.out.println("│           메인 메뉴                       │");
		System.out.println("└───────────────────────────┘");
		System.out.println("\t1. 성적입력 ");
		System.out.println("\t2. 성적출력 ");
		System.out.println("\t3. 종료 ");
		System.out.println("\t선택> ");
    }
    
    static void inputScore(ExamList list) {

		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  입력                      │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		
		for(int i = 0 ; i < list.score.length; i++) {
			list.score[i] = new Exam();
			System.out.printf("국어%d : ", i + 1);
			list.score[list.current].kors = scan.nextInt();
			if (list.score[list.current].kors < 0 || 100 < list.score[list.current].kors)
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

			System.out.printf("수학%d : ", i + 1);
			list.score[list.current].maths = scan.nextInt();
			if (list.score[list.current].maths < 0 || 100 < list.score[list.current].maths)
				System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");

			System.out.printf("영어%d : ", i + 1);
			list.score[list.current].engs = scan.nextInt();
			if (list.score[list.current].engs < 0 || 100 <list.score[list.current].engs )
				System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");
			
			System.out.printf("컴퓨터%d : ", i + 1);
			list.score[list.current].coms = scan.nextInt();
			if (list.score[list.current].coms < 0 || 100 <list.score[list.current].coms )
				System.out.println("컴퓨터성적은 0~100까지의 범위만 입력이 가능합니다.");
			list.current++;
			
			System.out.println("학생 추가입력 ? (y/n)");
			String yn = scan.next();
			if(yn.equals("N") || yn.equals("n"))
				break;
			if(list.current >= 3) {
				Exam temp[] = new Exam[list.score.length + 3];
				for(int j = 0 ; j < list.score.length; j++) {
					temp[j] = list.score[j];
				}
				list.score = temp;
			}
		}
		
		System.out.println("─────────────────────────────");

    }
    static void printScore(ExamList list) {
    	
    	System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  출력                      │");
		System.out.println("└───────────────────────────┘");
		System.out.println();
		
		int kors_total = 0;
		int engs_total = 0;
		int maths_total = 0;
		int coms_total = 0;

		for (int i = 0; i < list.current; i++) {
			System.out.printf("국어 %d : %3d\n", i+1, list.score[i].kors);
			kors_total += list.score[i].kors;
		}
		System.out.printf("총점 : %3d\n", kors_total);
		System.out.printf("평균 : %6.2f\n", kors_total/3.0);
		System.out.println("─────────────────────────────");
		
		for (int i = 0; i < list.current; i++) {
			System.out.printf("수학 %d : %3d\n", i+1, list.score[i].maths);
			maths_total += list.score[i].maths;
		}
		System.out.printf("총점 : %3d\n", maths_total);
		System.out.printf("평균 : %6.2f\n", maths_total/3.0);
		System.out.println("─────────────────────────────");
		
		for (int i = 0; i < list.current; i++) {
			System.out.printf("영어 %d : %3d\n", i+1, list.score[i].engs);
			engs_total += list.score[i].engs;
		}
		System.out.printf("총점 : %3d\n", engs_total);
		System.out.printf("평균 : %6.2f\n", engs_total/3.0);
		System.out.println("─────────────────────────────");
		
		for (int i = 0; i < list.current; i++) {
			System.out.printf("컴퓨터 %d : %3d\n", i+1, list.score[i].coms);
			coms_total += list.score[i].coms;
		}
		System.out.printf("총점 : %3d\n", coms_total);
		System.out.printf("평균 : %6.2f\n", coms_total/3.0);
		System.out.println("─────────────────────────────");
    }
}