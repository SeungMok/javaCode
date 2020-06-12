package studentManagement;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ManagementMain {
	public static void main(String[] args) {

		List<Student> students = new LinkedList<>();
		boolean run = true;

		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.입력 | 2.삭제 | 3.성적리스트출력 | 4.종료");
			System.out.println("----------------------------------");

			Scanner sc = new Scanner(System.in);
			System.out.println("메뉴> ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				String[] infoArray;
				while(true) {
					System.out.println("아이디 학생이름 국어 영어 수학 ");
					String info = sc.nextLine();
					infoArray = info.split(" |,");
					
					if(infoArray.length == 5)
						break;
					else
						System.out.println("잘못 입력하였습니다.");
				}
				students.add(
						new Student(
						Integer.parseInt(infoArray[0]),
						infoArray[1], 
						Integer.parseInt(infoArray[2]),
						Integer.parseInt(infoArray[3]), 
						Integer.parseInt(infoArray[4]))
						);
				
				break;
				
			case 2:
				System.out.println("아이디를 입력하세요 : ");
				int sno = sc.nextInt();
				for (int i = 0; i < students.size(); i++) {
					if (sno == students.get(i).getId())
						students.remove(i);
				}
				break;

			case 3:
				System.out.println("1.학번순  2.총점순");
				System.out.println("메뉴>");
				int printMenu = sc.nextInt();
				sc.nextLine();
				if(printMenu == 1)
					Collections.sort(students);
				else if(printMenu == 2)
					Collections.sort(students, Student.sortTotal);
				
				if(!students.isEmpty()) {
					for (Student s : students)
						System.out.println(s);
				}
				else
					System.out.println("학생 정보가 업습니다.");
				break;
				
			case 4:
				run = false;
				System.out.println("프로그램 종료");
			default:
				break;
			}

		}
	}
}
