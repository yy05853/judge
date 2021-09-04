package ac.abc217.c;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		int[] q = new int[n];
		for(int i = 1; i <= n; i++) {
			q[p[i-1]-1] = i;
		}

		System.out.print(q[0]);
		for(int i = 1; i < n; i++) {
			System.out.print(" " + q[i]);
		}

	}
}
