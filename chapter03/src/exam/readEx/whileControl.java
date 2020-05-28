package exam.readEx;

import java.io.IOException;

public class whileControl {
	public static void main(String[] args) throws IOException {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("---------------------------");
				System.out.println("1. 증가  || 2. 감소  ||  3. 정지  ");
				System.out.println("---------------------------");
				System.out.print("선택 : ");
			}
			
			keyCode = System.in.read();
			
			if(keyCode == 49) {
				speed++;
			}
			else if(keyCode == 50) {
				speed--;
			}
			else if(keyCode == 51) {
				run = false;
			}
			System.out.println("현재 속도 : "+speed);
		}
		System.out.println("프로그램 종료");
	}
}
