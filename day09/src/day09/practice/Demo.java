package day09.practice;

import java.util.ArrayList;
import java.util.Random;

public class Demo {
	
	public static void main(String[] args) {
		
		ArrayList<String> person = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			person.add("张三");
		}
		
		Random random = new Random();
		ArrayList<String> list = new ArrayList<String>();
		
		int next = random.nextInt(person.size());
		boolean isContains = list.contains(person.get(next));
		
		if (!isContains) {
			System.out.println("中奖的人是：" + person.get(next));
		}
		
		list.add(person.get(next));
		
		
	}

}
