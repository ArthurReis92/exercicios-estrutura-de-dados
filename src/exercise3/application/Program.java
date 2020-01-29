package exercise3.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import exercise3.dao.Stack;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Stack stack1 = new Stack();
		Stack stack2 = new Stack();
		Stack stack3 = new Stack();

		String path1 = "C:\\Arthur\\Unit - Especialização\\Programação 3\\Lista de exercicios\\stack1.txt";
		String path2 = "C:\\Arthur\\Unit - Especialização\\Programação 3\\Lista de exercicios\\stack2.txt";

		try {
			BufferedReader br1 = new BufferedReader(new FileReader(path1));
			BufferedReader br2 = new BufferedReader(new FileReader(path2));
			String lineStack1 = br1.readLine();
			String lineStack2 = br2.readLine();
			Integer number1 = Integer.parseInt(lineStack1);
			Integer number2 = Integer.parseInt(lineStack2);

			while (lineStack1 != null) {
				stack1.push(number1);
				lineStack1 = br1.readLine();
				if (lineStack1 != null) {
					number1 = Integer.parseInt(lineStack1);
				}
			}
			while (lineStack2 != null) {
				stack2.push(number2);
				lineStack2 = br2.readLine();
				if (lineStack2 != null) {
					number2 = Integer.parseInt(lineStack2);
				}
			}

			stack3 = ordering(stack1, stack2, stack3);
			stack3.print();
			br1.close();
			br2.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}
	
	public static Stack ordering(Stack stack1, Stack stack2, Stack stack3) {
		while(!stack1.isEmpty() && !stack2.isEmpty()) {
			if(stack1.peek() < stack2.peek()) {
				stack3.push(stack1.pop());
			} else {
				stack3.push(stack2.pop());
			}
		}
		if(stack1.isEmpty()) {
			while(!stack2.isEmpty()) {
				stack3.push(stack2.pop());
			}
		}else {
			while(!stack1.isEmpty()) {
				stack3.push(stack1.pop());
			}
		}
		return stack3;
	}
}
