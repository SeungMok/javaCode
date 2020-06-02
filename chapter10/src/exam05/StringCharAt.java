package exam05;

public class StringCharAt {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		for(int i = 0 ; i < subject.length(); i++) {
			char charValue = subject.charAt(i);
			System.out.println(charValue);
		}
		
		int index = subject.indexOf("프로그래밍");
		System.out.println(index);
				
		System.out.println(subject.replace("자바", "python"));
	}
}