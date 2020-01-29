package exercise2.dao;

import java.util.ArrayList;
import java.util.List;

public class Queue {
	private List<Integer> queueList;

	public Queue() {
		queueList = new ArrayList<Integer>();
	}

	public void add(Integer element) {
		queueList.add(element);
	}

	public Integer remove() {

		Integer removedElement = queueList.get(0);
		queueList.remove(0);
		return removedElement;

	}

	public void clearAll() {
		queueList.clear();
	}

	public void print() {
		int position = 1;
		for (Integer t : queueList) {
			System.out.println(position + ". " + t);
			position++;
		}
	}

	public int size() {
		return queueList.size();
	}

	public boolean isEmpty() {
		return queueList.isEmpty();
	}

//	public Queue ordering(Queue queue1, Queue queue2, Queue queue3) {
//		Integer removedQueue1;
//		Integer removedQueue2;
//		
//
//		return queue3;
//	}

	public Integer firstElement() {
		return queueList.get(0);
	}
}
