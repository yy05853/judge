package aizu.ALDS1_4_A;

import java.util.Scanner;

// 線形探索
public class Main {
	public static int n;
	public static int[] s;
	public static int q;
	public static int[] t;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		s = new int[n+1];
		for(int i = 0; i< n; i++) {
			s[i] = sc.nextInt();
		}
		q = sc.nextInt();
		t= new int [q];
		for(int i = 0; i< q; i++) {
			t[i] = sc.nextInt();
		}


		int num = 0;
		for(int i = 0; i< q; i++) {
			int tmp = linearSearch(t[i]);
			if(tmp != -1) {
				num++;
			}

		}

		System.out.println(num);
	}

	public static int linearSearch(int key) {
		int i = 0;
		s[n] = key;
		while (s[i] != key) {
			i++;
		}
		if(i == n) {
			return -1;
		}
		return key;
	}

}
