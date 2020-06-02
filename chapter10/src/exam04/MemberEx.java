package exam04;

public class MemberEx {
	public static void main(String[] args) {
		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		Member m3 = new Member("white");
		
		if(m3.equals(m3)) {
			System.out.println("같습니다");
		}
		else
			System.out.println("다릅니다");
	}
}
