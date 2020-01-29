package exercicio1.dao;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
	private List<T> queueList;

	public Queue() {
		queueList = new ArrayList<T>();
	}

	public void add(T element) {
		queueList.add(element);
	}

	public T remove() {

		T removedElement = queueList.get(0);
		queueList.remove(0);
		return removedElement;

	}

	public void clearAll() {
		queueList.clear();
	}

	public void print() {
		int position = 1;
		for (T t : queueList) {
			System.out.println(position + ". " + t);
			position++;
		}
	}

	public int size() {
		return queueList.size();
	}

	public void reverse(Stack<T> stack) {
		int queueSize = size();
		for (int i = 0; i < queueSize; i++) {
			stack.push(remove());
		}
		for (int i = 0; i < queueSize; i++) {
			add(stack.pop());
		}

	}
}
