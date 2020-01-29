package exercise3.dao;

import java.util.ArrayList;
import java.util.List;

public class Stack {
	private List<Integer> stack;

	public Stack() {
		stack = new ArrayList<Integer>();
	}

	public void push(Integer element) {
		stack.add(element);
	}

	public Integer pop() {
		int last = stack.size() - 1;
		Integer removedElement = peek();
		stack.remove(last);

		return removedElement;
	}

	public Integer peek() {
		int last = stack.size() - 1;
		Integer consultElement = stack.get(last);
		return consultElement;
	}
	
	public void print() {
		int position = 1;
		for (Integer t : stack) {
			System.out.println(position + ". " + t);
			position++;
		}
	}
	
	public void removeAll() {
		stack.clear();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
}
