package aizu.ALDS1_3_A;

import java.util.Scanner;

public class Main {
	public static long[] stack = new long[200];
	public static int index;

	public static void main(String[] args) {
		index = 0;

		try(Scanner sc = new Scanner(System.in)) {

			while(sc.hasNext()) {
				String x = sc.next();
				if("+".equals(x)) {
					long b = pop();
					long a = pop();
					push(a + b);
					continue;
				}
				if("-".equals(x)) {
					long b = pop();
					long a = pop();
					push(a - b);
					continue;
				}
				if("*".equals(x)) {
					long b = pop();
					long a = pop();
					push(a * b);
					continue;
				}
				push(Long.parseLong(x));
			}
			sc.close();
		}

		System.out.println(pop());
	}

	public static void push(long x) {
		stack[index++] = x;
	}

	public static long pop() {
		return stack[--index];
	}

	public static boolean isEmpty() {
		return index == 0;
	}

}
