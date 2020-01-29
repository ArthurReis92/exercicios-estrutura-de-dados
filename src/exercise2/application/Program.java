package exercise2.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import exercise2.dao.Queue;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Queue queue1 = new Queue();
		Queue queue2 = new Queue();
		Queue queue3 = new Queue();

		String path1 = "C:\\Arthur\\Unit - Especialização\\Programação 3\\Lista de exercicios\\queue1.txt";
		String path2 = "C:\\Arthur\\Unit - Especialização\\Programação 3\\Lista de exercicios\\queue2.txt";

		try {
			BufferedReader br1 = new BufferedReader(new FileReader(path1));
			BufferedReader br2 = new BufferedReader(new FileReader(path2));
			String lineQueue1 = br1.readLine();
			String lineQueue2 = br2.readLine();
			Integer number1 = Integer.parseInt(lineQueue1);
			Integer number2 = Integer.parseInt(lineQueue2);

			while (lineQueue1 != null) {
				queue1.add(number1);
				lineQueue1 = br1.readLine();
				if (lineQueue1 != null) {
					number1 = Integer.parseInt(lineQueue1);
				}
			}
			while (lineQueue2 != null) {
				queue2.add(number2);
				lineQueue2 = br2.readLine();
				if (lineQueue2 != null) {
					number2 = Integer.parseInt(lineQueue2);
				}
			}

			queue3 = ordering(queue1, queue2, queue3);
			queue3.print();
			br1.close();
			br2.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		sc.close();

	}

	public static Queue ordering(Queue queue1, Queue queue2, Queue queue3) {

		while (!queue1.isEmpty() && !queue2.isEmpty()) {
			if (queue1.firstElement() < queue2.firstElement()) {
				queue3.add(queue1.remove());
			} else {
				queue3.add(queue2.remove());
			}
		}
		if(queue1.isEmpty()) {
			while(!queue2.isEmpty()) {
				queue3.add(queue2.remove());
			}
		} else {
			while(!queue1.isEmpty()) {
				queue3.add(queue1.remove());
			}
		}
		return queue3;
	}
}
