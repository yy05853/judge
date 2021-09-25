package aizu.ALDS1_4_B;

import java.util.Scanner;

// 二分探索
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
			int tmp = binarySearch(t[i]);
			if(tmp != -1) {
				num++;
			}

		}

		System.out.println(num);
	}

	private static int binarySearch(int i) {
		int left = 0;
		int right = n;
		while(left < right) {
			int mid = (left + right) / 2;
			if(s[mid] == i) {
				return mid;
			} else if(i < s[mid]) {
				right = mid;
			} else {
				left = mid+1;
			}
		}

		return -1;
	}

}
