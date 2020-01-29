package exercise5.dao;

import java.util.ArrayList;
import java.util.List;

import exercise5.exceptions.IsEmptyException;

public class Queue<T> {
	private List<T> queueList;

	public Queue() {
		queueList = new ArrayList<T>();
	}

	public void add(T element) {
		queueList.add(element);
	}

	public T remove() {
		if (!queueList.isEmpty()) {
			T removedElement = queueList.get(0);
			queueList.remove(0);
			return removedElement;
		} else {
			throw new IsEmptyException("The queue is empty!");
		}

	}

	public void clearAll() {
		if (!queueList.isEmpty()) {
			queueList.clear();
		} else {
			throw new IsEmptyException("The queue is empty!");
		}
	}

	public String print() {
		String toPrint = "";
		if (!queueList.isEmpty()) {
			int position = 1;
			for (T t : queueList) {
				toPrint += position + " .\n" + t.toString() + "\n\n";
				position++;
			}
			return toPrint;
		} else {
			throw new IsEmptyException("The queue is empty!");
		}
	}

	public int size() {
		return queueList.size();
	}

	public boolean isEmpty() {
		return queueList.isEmpty();
	}

	public T firstElement() {
		if (!queueList.isEmpty()) {
			return queueList.get(0);
		} else {
			throw new IsEmptyException("The queue is empty!");
		}
	}
	
	public boolean exist(T element) {
		return queueList.contains(element);
	}
}
