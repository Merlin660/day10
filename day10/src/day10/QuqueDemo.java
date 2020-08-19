package day10;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class QuqueDemo {
	
	
	@Test
	public void demo1() {
		
		// 获取
		Queue<String> queue = new LinkedList<String>();
		
		// 添加
		
		queue.add("string12");
		queue.add("string2");
		queue.add("string3");
		queue.add("string4");
		System.out.println(queue);
		System.out.println("===========");
		
		
		queue.offer("string5");
		System.out.println(queue);
		
		// add可能会抛异常，offer不会抛异常
		
		
		
		/***
		 * 取出的差别：
		 * 
		 * 		1.remove,删除队列第一个对象返回，可能会抛异常
		 * 		2.pool,删除队列第一个对象返回，不会抛异常
		 * 		3.peek,获取队列第一个对象返回，不会删除元素
		 */
		//取出
//		String name = queue.remove();	
		
		
//		String name1 = queue.poll();
		
		
		String name1 = queue.peek();
		System.out.println(name1);
		
		
		
		
	}

}
