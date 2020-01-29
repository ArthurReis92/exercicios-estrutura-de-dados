package exercise4.application;

import java.util.Locale;
import java.util.Scanner;

import exercise4.dao.Stack;
import exercise4.exceptions.IsEmptyException;

public class TestaPilha {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
		int n;
		
		char ch = 's';
		while (ch != 'n') {
			System.out.println("Digite um número inteiro: ");
			n = sc.nextInt();
			if (n % 2 == 0) {
				stack.push(n);
			} else {
				try {
					System.out.println("The element " + stack.pop() + " was removed from stack!");
				} catch (IsEmptyException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
			System.out.print("Would you like to insert another number? (s/n) ");
			ch = sc.next().charAt(0);
		}
		int stackSize = stack.size();
		for (int i = 0; i < stackSize; i++) {
			System.out.println((stackSize - i) + ". " + stack.pop());
		}
		sc.close();
	}

}
