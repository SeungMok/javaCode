package exam.ifTest;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		
		System.out.println("성적은 ? ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String prize;
		
		if(num == 100)
			prize = "A+";
		else if(num > 90)
			prize = "A";
		else if(num > 80)
			prize = "A";
		else if(num > 70)
			prize = "A";
		else if(num > 60)
			prize = "A";
		else
			prize = "A";
		
		
		
		switch (num/10) {
		case 10:
			System.out.println("학점 : A+");
			break;
		case 9:
			System.out.println("학점 : A");
			break;
		case 8:
			System.out.println("학점 : B");
			break;
		case 7:
			System.out.println("학점 : C");
			break;
		case 6:
			System.out.println("학점 : D");
			break;

		default:
			System.out.println("학점 : F");
			break;
		}
	}
}
