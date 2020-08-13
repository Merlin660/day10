package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class SetDemo {
	
	@Test
	public void demo1() {
		
		Set<String> s = new HashSet<String>();
 		
	}
	
	@Test
	public void demo2() {
		
		Set<String> s = new HashSet<String>();
		
		s.add("string1");
		s.add("string2");
		s.add("string3");
		s.add("string4");
		System.out.println(s);
		System.out.println("===========");
		
		s.remove("string1");
		System.out.println(s);
		System.out.println("===========");
		
		Iterator<String> iterator = s.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		
		
	}
	
	@Test
	public void demo3() {
		
		Set<String> s = new HashSet<String>();
		
		
		
	}

}
