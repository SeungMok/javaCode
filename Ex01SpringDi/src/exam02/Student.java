package exam02;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student)	{
			Student stu = (Student) obj;
			return (sno==stu.sno) && (name==stu.name);
		}
		else 
			return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return sno+name.hashCode();
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}

	
	
	
	
}
