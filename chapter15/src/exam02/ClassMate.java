package exam02;

import java.util.Comparator;

public class ClassMate implements Comparable<ClassMate>{
	int sno;
	String name;
	
	public ClassMate(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "ClassMate [sno=" + sno + ", name=" + name + "]";
	}


	@Override
	public int compareTo(ClassMate o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
	public static Comparator<ClassMate> comparator_name = new Comparator<ClassMate>(){
		public int compare(ClassMate o1, ClassMate o2) {
			return o1.name.compareTo(o2.name) * -1;
		}
	};
	
	public static Comparator<ClassMate> com_name = new Comparator<ClassMate>() {
		
		@Override
		public int compare(ClassMate o1, ClassMate o2) {
			// TODO Auto-generated method stub
			return 0;
		}
	};
}
