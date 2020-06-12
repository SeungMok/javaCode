package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
//		List<String> list = new Vector<String>();		
//		List<String> list = new LinkedList<String>();		
		
		list.add("Java");
		list.add("Test");
		list.add("t3");
		

		list.add(1,"insertTest2");
		
		int size = list.size();
		
		System.out.println(size);
		System.out.println(list.get(3));
		
		
		
		
		for(int i = 0 ; i < size ; i++)
			System.out.println(list.get(i));
	}
}
