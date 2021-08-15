package aizu.ALDS1_1_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

//		挿入ソートは、入力のデータの並びが、
//		計算量に大きく影響する興味深いアルゴリズムの１つです。
//		計算量が O(N2)になるのは、データが降順に並んでいる場合です。
//		一方、データが昇順に並んでいる場合は A[j] の移動が必要ないため、
//		おおよそ N 回の比較ですみます。
//		従って、挿入ソートはある程度整列されたデータに対しては
//		高速に動作する特長を持ちます。

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print(a[0]);
		for(int k = 1; k < n; k++) {
			System.out.print(" " + a[k]);
		}
		System.out.println();

		for(int i = 1; i < n; i++) {
			int v = a[i];
			int j = i-1;
			while((j >= 0) && (a[j]) > v ) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = v;
			System.out.print(a[0]);
			for(int k = 1; k < n; k++) {
				System.out.print(" " + a[k]);
			}
			System.out.println();
		}

	}

}
