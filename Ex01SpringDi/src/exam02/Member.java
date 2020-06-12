package exam02;

public class Member {

		public String name;
		public int age;
		
		public Member(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return name.hashCode()+age;
		}

		@Override
		public String toString() {
			return "Member [name=" + name + ", age=" + age + "]";
		}
		
		
	
}
