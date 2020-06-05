package exam02;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ClassMateTest {
	public static void main(String[] args) {
		List<ClassMate> classes = new LinkedList<>();
		
		classes.add(new ClassMate(20170506, "홍길동"));
		classes.add(new ClassMate(20180201, "홍길순"));
		classes.add(new ClassMate(20170502, "이승목"));
		classes.add(new ClassMate(20140221, "홍길영"));
		
		Collections.sort(classes);
//		Collections.sort(classes,Collections.reverseOrder());
		
		for(ClassMate s : classes)
			System.out.println(s);
	}
}
