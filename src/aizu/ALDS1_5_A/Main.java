package aizu.ALDS1_5_A;

import java.util.Scanner;

public class Main {
	public static int n;
	public static int[] x;
	public static boolean[] bit;

	public static int m;
	public static int[] y;
	public static boolean[] ans;

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		x = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		m = sc.nextInt();
		y = new int[m];
		for(int i = 0; i < m; i++) {
			y[i] = sc.nextInt();
		}

		// 初期化
		bit = new boolean[n];
		for(int i = 0; i < n; i++) {
			bit[i] = false;
		}
		ans = new boolean[m];
		for(int i = 0; i < m; i++) {
			ans[i] = false;
		}

		// 再帰
		rec(0);

		// 出力
		for(int i = 0; i < m; i++) {
			if(ans[i]) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}

	private static void rec(int i) {
		if(i == n) {

			int sum = 0;
			for(int j = 0; j < n; j++) {
				if(bit[j]) {
					sum += x[j];
				}
			}

			for(int j = 0; j < m; j++) {
				if(sum == y[j]) {
					ans[j] = true;
				}
			}
			return;
		}

		rec(i+1);
		bit[i] = true;
		rec(i+1);
		bit[i] = false;
	}

}
