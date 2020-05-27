package exam.operation;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int target = scan.nextInt();
		int result = 2;
		
		for(int num = 3; num < target; num++) {
			for(int compNum = num-1; compNum > 1 ; compNum--) {
				if(num%compNum == 0)
					break;
				if(compNum == 2 && num%compNum != 0)
					result++;
				}
		}
		System.out.println(target+"은 "+result+"번 째 소수");
	}
}
