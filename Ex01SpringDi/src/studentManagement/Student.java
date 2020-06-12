package studentManagement;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	public Student(int id, String name, int kor, int eng, int math) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = total/3.0;
	}
	
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total="
				+ total + ", avg=" + avg + "]";
	}


	//기본-학생번호 순서로 정렬 되도록 
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return id - o.id;
	}
	
	//총점 순으로 정렬하도록
	public static Comparator<Student> sortTotal = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return (o1.total - o2.total) * -1;
		}
	};

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
