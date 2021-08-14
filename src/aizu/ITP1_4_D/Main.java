package aizu.ITP1_4_D;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int min = 1000000;
		int max = (-1) * 1000000;
		long sum = 0;

		for(int i = 0; i < n; i++) {
			if(min > a[i]) min = a[i];
			if(max < a[i]) max = a[i];
			sum += a[i];
		}
		System.out.print(min);
		System.out.print(" ");
		System.out.print(max);
		System.out.print(" ");
		System.out.println(sum);

	}

}
