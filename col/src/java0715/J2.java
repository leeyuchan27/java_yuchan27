package java0715;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class J2 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		Queue<String>q=new LinkedList<>();
		
		pq.offer(56);
		pq.offer(100);
		pq.offer(5);
		pq.offer(30);
		pq.offer(2);
		
		System.out.println(pq);
		
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q.size());
		System.out.println(q.contains("º¹¼þ¾Æ"));
		
	}

}
