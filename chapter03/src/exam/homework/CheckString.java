package exam.homework;

import java.util.ArrayList;
import java.util.Scanner;


public class CheckString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char temp;
		ArrayList<Character> charList = new ArrayList<Character>();
		ArrayList<Character> numList = new ArrayList<Character>();
		
		System.out.println("문자열을 입력하세요");
		String input = sc.nextLine();
		
		for(int i = 0 ; i < input.length(); i++) {
			temp = input.charAt(i);
			if(temp >= '0' && temp <= '9')
				numList.add(temp);
			else
				charList.add(temp);
		}
		System.out.println("숫자 : " + numList);
		System.out.println("문자 : " + charList);
	}
}
