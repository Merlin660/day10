package day10;

import java.util.PriorityQueue;

import org.junit.Test;

public class PriorityQueueDemo {
	
	
	@Test
	public void demo1() {
		
		PriorityQueue<String> pQueue = new PriorityQueue<String>();
		
		pQueue.add("g");
		pQueue.add("l");
		pQueue.add("e");
		pQueue.add("a");
		pQueue.add("d");
		pQueue.add("v");
		pQueue.add("n");
		pQueue.add("w");
		pQueue.add("r");
		pQueue.add("t");
		
		String s = pQueue.poll();
		while (s != null) {
			System.out.println(s);
			s = pQueue.poll();
		}
		
		
	}
	
	@Test
	public void demo2() {
		
		PriorityQueue<String> p = new PriorityQueue<String>();
	
		
		
		
		
	}
	
	

}
