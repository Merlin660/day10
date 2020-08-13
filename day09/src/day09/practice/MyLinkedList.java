package day09.practice;

/**
 * 	自定义的LinkedList
 * @author Administrator
 *
 */
public class MyLinkedList {

	private class Node {
		
		// 下一个节点
		private Node next;
		
		// 存储的数据
		private Object o;
		
		public Node(Node next, Object o) {
			this.next = next;
			this.o = o;
		}
	}
	
	// 开头
	private Node first;
	
	// 结尾
	private Node last;
	
	// 多少个
	private int size;
	
	/**
	 * 	添加
	 * @param o 数据
	 * @return 添加结果
	 */
	public boolean add(Object o) {
		Node node = new Node(null, o);
		if(first == null) {
			first = node;
			last = node;
		} else {
			// 如果不是第一个
			last.next = node;
			last = node;
		}
		size++;
		return true;
	}
	
	/**
	 * 	获取
	 * @param index 下标
	 * @return 数据
	 */
	public Object get(int index) {
		Node returnNode = first;
		for(int i=0; i<index; i++) {
			returnNode = returnNode.next;
		}
		return returnNode.o;
	}
	
	public int size() {
		return size;
	}

	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add("xxxx");
		list.add("xxxx1");
		list.add("xxxx2");
		list.add("xxxx3");
		System.out.println(list.get(3));
		System.out.println(list.size());
	}
	
	
	
	
	
	
	
}
