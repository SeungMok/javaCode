package exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("나");
		set.add("나나나나!");
		set.add("나나나나!");
		set.add("나나나나!");
		set.add("나나나나!");
		
		System.out.println(set.size());
		
		for(String s : set) {
			System.out.println(s);
		}
	}
}