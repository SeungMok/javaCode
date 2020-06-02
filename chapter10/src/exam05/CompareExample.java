package exam05;

public class CompareExample {
	public static void main(String[] args) {
		StudentComparator sc = new StudentComparator();
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		int result = sc.compare(s1, s2);
		System.out.println(result);
		result = sc.compare(s1, s3);
		System.out.println(result);
	}
	static class Student{
		int sno;
		Student(int sno){
			this.sno = sno;
		}
	}
}
