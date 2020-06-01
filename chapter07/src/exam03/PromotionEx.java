package exam03;

public class PromotionEx {
	public static void main(String[] args) {
		A a = new A();
		A ab = new B();
		A ac = new C();
		A ad = new D();
		A ae = new E();
		
		if(ae instanceof A)
			System.out.println("맞아요");
		else
			System.out.println("아니에요");
	}
}
