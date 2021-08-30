package aizu.ALDS1_2_D;

import java.util.Scanner;

public class Main {

	public static int n;
	public static int[] a;
	public static int cnt;

	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		// シェルソート
		cnt = 0;
		int m = 1;
		int[] g = new int[100];
		g[0] = 1;
		while(g[m-1] < n) {
			g[m] = g[m-1]*3+1;
			m++;
		}

		for(int i = m-1; i >= 0; i--) {
			// 挿入ソート
			insertionSort(g[i]);
		}

		if(m == 1) {
			System.out.println(1);
			System.out.println(1);
		} else {
			System.out.println(m-1);
			System.out.print(g[m-2]);
			for(int i = m-3; i >= 0; i--) {
				System.out.print(" " + g[i]);

			}

			System.out.println();

		}
		System.out.println(cnt);
		// 出力
		for(int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}

	public static void insertionSort(int g) {
		for(int i = g; i < n; i++) {
			int v = a[i];
			int j = i - g;
			while((j >= 0) && (a[j] > v)) {
				a[j+g] = a[j];
				j = j - g;
				cnt++;
			}
			a[j+g] = v;
		}

	}

}
