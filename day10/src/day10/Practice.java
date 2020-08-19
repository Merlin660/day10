package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class Practice {
	
	
	@Test
	public void demo() {
		final int start = 10;
		final int end = 20;
		
		List<Integer> numbers = new ArrayList<Integer>(); 
		for(int i=start; i<=end; i++) {
			numbers.add(i);
		}
		System.out.println(numbers);
		
		Random random = new Random();
		numbers.remove(random.nextInt(numbers.size()));
		System.out.println(numbers);
		
		// findMissNumber(start, end, numbers); 完成方法
		
	}
	

}
