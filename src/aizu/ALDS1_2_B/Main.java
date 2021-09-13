package aizu.ALDS1_2_B;

import java.util.Scanner;

// 選択ソート
public class Main {
	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int num = 0;
		for(int i = 0; i < n; i++) {
			int minj = i;
			for(int j = i; j < n; j++) {
				if(a[j] < a[minj]) {
					minj = j;
				}
			}
			if(i != minj) {
				int tmp = a[i];
				a[i] = a[minj];
				a[minj] = tmp;
				num++;

			}
		}

		// 出力
		System.out.print(a[0]);
		for(int i = 1; i < n; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println();
		System.out.println(num);
	}
}
