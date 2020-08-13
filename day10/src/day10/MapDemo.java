package day10;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapDemo {
	
	
	@Test
	public void demo1() {
		
		// Map的获取
		Map<String, Object> map = new HashMap<String, Object>();
		
		
	}
	
	@Test
	public void demo2() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		// Map的添加
		map.put("110", "张三1");
		map.put("120", "张三2");
		map.put("130", "张三3");
		map.put("140", "张三4");
		
		System.out.println(map);
	}
	
	
	@Test
	public void demo3() {
		Map<String, String> map = createMap();
		System.out.println(map);
		System.out.println("===========");
		
		// 删除
		map.remove("4");
		System.out.println(map);
		System.out.println("============");
		
		map.remove("3");
		System.out.println(map);
		
		
	}
	
	@Test
	public void demo4() {
		Map<String, String> map = createMap();
		String name = map.get("1");
		System.out.println(name);
		

	}
	
	
	public Map<String, String> createMap() {
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < 6; i++) {
			map.put("" + i, "张三" + i);
		}
		
		return map;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
