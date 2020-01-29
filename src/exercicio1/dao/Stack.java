package exercicio1.dao;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
	private List<T> stack;

	public Stack() {
		stack = new ArrayList<T>();
	}

	public void push(T element) {
		stack.add(element);
	}

	public T pop() {
		int last = stack.size() - 1;
		T removedElement = peek();
		stack.remove(last);

		return removedElement;
	}

	public T peek() {
		int last = stack.size() - 1;
		T consultElement = stack.get(last);
		return consultElement;
	}
	
	public void print() {
		int position = 1;
		for (T t : stack) {
			System.out.println(position + ". " + t);
			position++;
		}
	}
	
	public void removeAll() {
		stack.clear();
	}
}
