package aizu.ALDS1_1_D;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 数列から2つ選んで、最大値または最小値を求める問題に応用できる

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] r = new int[n];
		for(int i = 0; i < n; i++ ) {
			r[i] = sc.nextInt();
		}

		int min = r[0];
		long max = (-1) * 10000000000l;
		for(int j = 1; j < n; j++) {
			if(max < r[j]-min) max = r[j]-min;
			if(min > r[j]) min = r[j];
		}
		System.out.println(max);
	}

}
