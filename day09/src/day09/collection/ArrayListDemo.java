package day09.collection;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayListDemo {
	
	@Test
	public void demo1() {
		
		ArrayList<String> list = new ArrayList<String>();
		
//		list.add(1);
		list.add("string");
		
		String string = list.get(0);
		System.out.println(string);
		
	}
	
	@Test
	public void demo2() {
		
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("string0");
		strings.add(1,"string5");
		
		ArrayList<String> stringSub = new ArrayList<String>();
		stringSub.add("111");
		stringSub.add("222");
		strings.addAll(stringSub);
		strings.addAll(4, stringSub);
		System.out.println(strings.toString());
		
		
		
	}
	
	@Test
	public void demo3() {
		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			strings.add("我是" + i);
		}
		System.out.println(strings);
		
//		Object[] array = strings.toArray();
		
		System.out.println("=============");
		
		for (int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(i));
		}
		System.out.println();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
