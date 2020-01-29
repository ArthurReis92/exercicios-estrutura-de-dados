package exercise4.dao;

import java.util.ArrayList;
import java.util.List;

import exercise4.exceptions.IsEmptyException;

public class Stack {
	private List<Integer> stack;

	public Stack() {
		stack = new ArrayList<Integer>();
	}

	public void push(Integer element) {
		stack.add(element);
	}

	public Integer pop() {
		if (!stack.isEmpty()) {
			int last = stack.size() - 1;
			Integer removedElement = peek();
			stack.remove(last);
			return removedElement;
		} else {
			throw new IsEmptyException("This stack is empty!");
		}

	}

	public Integer peek() {
		if (!stack.isEmpty()) {
			int last = stack.size() - 1;
			Integer consultElement = stack.get(last);
			return consultElement;
		} else {
			throw new IsEmptyException("This stack is empty!");
		}
	}

	public void print() {
		if (!stack.isEmpty()) {
			int position = 1;
			for (Integer t : stack) {
				System.out.println(position + ". " + t);
				position++;
			}
		} else {
			throw new IsEmptyException("This stack is empty!");
		}
	}

	public void removeAll() {
		if (!stack.isEmpty()) {
			stack.clear();
		} else {
			throw new IsEmptyException("This stack is empty!");
		}
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public int size() {
		return stack.size();
	}
}
