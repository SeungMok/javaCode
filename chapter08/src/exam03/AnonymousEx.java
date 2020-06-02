package exam03;

public class AnonymousEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous anony = new Anonymous();
		anony.field.wake();
		anony.method();
		anony.method2(
			new Person() {
				void study() {
					System.out.println("공부");
				}
				@Override
				void wake() {
					// TODO Auto-generated method stub
					System.out.println("8시에 일어남");
					study();
				}
		});
	}

}
