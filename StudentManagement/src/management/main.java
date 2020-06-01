package management;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		int menuNum;
		boolean run = true;
		String check;
		String name;
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("학생의 수를 입력하세요.");
		int studentNum = sc.nextInt();
		Students student[] = new Students[studentNum];
		
		while (run) {
			System.out.println("========================================");
			System.out.println("메뉴 : 1.학생 점수 입력, 2.성적처리결과리스트, 3.종료");
			System.out.println("========================================");
			System.out.print("메뉴를 선택 >>  ");

			menuNum = sc.nextInt();
			sc.nextLine();

			switch (menuNum) {
			case 1:
				for (int i = 0; i < student.length; ) {
					String stu_name;
					int stu_korean;
					int stu_english;
					int stu_math;
					
					System.out.println("학생"+(i+1)+"의 이름을 입력하세요");
					stu_name = sc.nextLine();
					System.out.println(stu_name+".학생의 국영수 성적을 입력하세요.");
					stu_korean = sc.nextInt();
					stu_english = sc.nextInt();
					stu_math = sc.nextInt();
					
					student[i] = new Students(stu_name,stu_korean,stu_english,stu_math);
					
					sc.nextLine();
					System.out.println(student[i].name+".학생의 성적 (국어:"+student[i].korean+", 수학:"+student[i].math+", 영어:"+student[i].english+")");
					System.out.println("이 성적이 맞습니까 ? y/n");
					check = sc.nextLine();
					if(check.equals("Y") || check.equals("y"))
						i++;					
				}
				break;
				
			case 2:
				
				System.out.println("성적을 알고 싶은 학생 : ");
				sc.nextLine();
				name = sc.nextLine();				
				for(int i = 0; i < student.length; i++)
					if(student[i].name.equals(name)) {
						System.out.println(student[i].name+"학생의 성적 (국어:"+student[i].korean+", 영어:"+student[i].english+", 수학:"+student[i].math+")");
						System.out.println(student[i].name+"학생의 3과목 평균 : "+student[i].avg);
					}else
						System.out.println(student[i].name+"학생의 성적은 존재하지 않습니다.");
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
