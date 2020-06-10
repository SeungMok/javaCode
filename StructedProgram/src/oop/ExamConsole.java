package oop;

public class ExamConsole {
	ExamList list = new ExamList(new Exam[3], 0);
	
	 void printScore() {
	    	
	    	System.out.println("┌───────────────────────────┐");
			System.out.println("│           성적  출력                      │");
			System.out.println("└───────────────────────────┘");
			System.out.println();
			
			int kors_total = 0;
			int engs_total = 0;
			int maths_total = 0;
			int coms_total = 0;

			for (int i = 0; i < list.getCurrent(); i++) {
				System.out.printf("국어 %d : %3d\n", i+1, list.score[i].getKors());
				kors_total += list.score[i].getKors();
			}
			System.out.printf("총점 : %3d\n", kors_total);
			System.out.printf("평균 : %6.2f\n", kors_total/3.0);
			System.out.println("─────────────────────────────");
			
			for (int i = 0; i < list.getCurrent(); i++) {
				System.out.printf("수학 %d : %3d\n", i+1, list.score[i].getMaths());
				maths_total += list.score[i].getMaths();
			}
			System.out.printf("총점 : %3d\n", maths_total);
			System.out.printf("평균 : %6.2f\n", maths_total/3.0);
			System.out.println("─────────────────────────────");
			
			for (int i = 0; i < list.getCurrent(); i++) {
				System.out.printf("영어 %d : %3d\n", i+1, list.score[i].getEngs());
				engs_total += list.score[i].getEngs();
			}
			System.out.printf("총점 : %3d\n", engs_total);
			System.out.printf("평균 : %6.2f\n", engs_total/3.0);
			System.out.println("─────────────────────────────");
			
			for (int i = 0; i < list.getCurrent(); i++) {
				System.out.printf("컴퓨터 %d : %3d\n", i+1, list.score[i].getComs());
				coms_total += list.score[i].getComs();
			}
			System.out.printf("총점 : %3d\n", coms_total);
			System.out.printf("평균 : %6.2f\n", coms_total/3.0);
			System.out.println("─────────────────────────────");
	    }
}
