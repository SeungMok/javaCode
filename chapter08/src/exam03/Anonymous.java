package exam03;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println("6시 기상");
			work();
		}
	};
	
	void method() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				// TODO Auto-generated method stub
				super.wake();
				walk();
			}
		};
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
