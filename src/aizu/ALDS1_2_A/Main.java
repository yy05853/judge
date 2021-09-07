package aizu.ALDS1_2_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		boolean flag = true;
		int i = 0;
		int num = 0;
		while(flag) {
			flag = false;
			for(int j = n-1; j > i; j--) {
				if(a[j] < a[j-1]) {
					int tmp = a[j];
					a[j] = a[j-1];
					a[j-1] = tmp;
					flag = true;
					num++;
				}
			}
			i++;
		}

		// 出力
		System.out.print(a[0]);
		for(int k = 1; k < n; k++) {
			System.out.print(" " + a[k]);
		}
		System.out.println();

		System.out.println(num);

	}

}
