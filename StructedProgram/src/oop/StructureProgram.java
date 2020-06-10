package oop;

import java.util.Scanner;

public class StructureProgram {
	static Scanner scan = new Scanner(System.in);
	
    public static void main(String[] args) {
    	ExamConsole consol = new ExamConsole();
    	
		int menu;
		boolean keepLoop = true;

		while (keepLoop) {
			printMenu();
			menu = scan.nextInt();
			switch (menu) {
				case 1:
					consol.list.inputScore(scan);
					break;
				case 2:
					consol.list.printScore();
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
}