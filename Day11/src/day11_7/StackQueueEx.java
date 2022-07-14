package day11_7;

import java.util.*;

public class StackQueueEx {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2"); //후입선출
		
		
		q.offer("0");
		q.offer("1");
		q.offer("2"); //선입선출
		
		System.out.println("= Stack =");
		while(!st.empty()) {				//스택이 비지 않으면 돌아간다. 빌때까지 돌아라. 
			System.out.println(st.pop());
		}
		
		System.out.println("= Queue =");
		while(!q.isEmpty()) {				//비었니? 돌아라
			System.out.println(q.poll());
		}
	}
	
}
