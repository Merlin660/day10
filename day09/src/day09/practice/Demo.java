package day09.practice;

import java.util.ArrayList;
import java.util.Random;

/**
 * 	随机抽奖
 * @author Administrator
 *
 */
public class Demo {

	public static void main(String[] args) {
		
		// 1.抽奖的人
		ArrayList<String> persons = new ArrayList<String>();
		for(int i=0; i<10; i++) {
			persons.add("张三" + i);
		}
		
		Random random = new Random();
		ArrayList<String> list = new ArrayList<String>(); // 抽过奖的人
		
		for(int i=0; i<persons.size(); i++) {
			// 抽奖一次
			while(true) {
				int next = random.nextInt(persons.size());
				String nextPerson = persons.get(next);// 下一个要抽奖的人
				if (!list.contains(nextPerson)) {
					System.out.println("中奖的是：" + nextPerson);
					list.add(nextPerson);
					break;
				}
			}
		}
	}
	
	
}
