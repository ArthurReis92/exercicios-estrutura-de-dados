package exercicio1.application;

import java.util.Locale;
import java.util.Scanner;

import exercicio1.dao.Queue;
import exercicio1.dao.Stack;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Queue<String> queue = new Queue<String>();
		Stack<String> stack = new Stack<String>();
		char ch;
		char resp;
		char ans;
		do {
			System.out.println("Enter:" + "\n 1 - Add name" + "\n 2 - Remove name" + "\n 3 - Print names"
					+ "\n 4 - Clear queue" + "\n 5 - Reverse queue");
			int n = sc.nextInt();
			sc.nextLine();

			switch (n) {
			case 1:
				do {
					System.out.println("Enter the name to be added: ");
					String name = sc.nextLine();
					queue.add(name);
					System.out.print("Would you like to add other name? (y/n) ");
					resp = sc.next().charAt(0);
					sc.nextLine();
				} while (resp == 'y');
				break;
			case 2:
				ans = 'y';
				while (ans == 'y') {
					queue.remove();
					System.out.println("Did anyone else leave the queue? (y/n) ");
					ans = sc.next().charAt(0);
				}
				break;
			case 3:
				ans = 'y';
				while (ans == 'y') {
					queue.print();
					System.out.print("Would you like to print all names o the queue again? ");
					ans = sc.next().charAt(0);
				}
				break;
			case 4:
				queue.clearAll();
				break;
			case 5:

				do {
					queue.reverse(stack);
					System.out.print("Would you like to reverse all names o the queue again? ");
					resp = sc.next().charAt(0);
				} while (resp != 'n');
				break;
			}
			System.out.print("Do you want finish the program? ");
			ch = sc.next().charAt(0);
		} while (ch != 'y');

		sc.close();
	}

}
