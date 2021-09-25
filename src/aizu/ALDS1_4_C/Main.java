package aizu.ALDS1_4_C;

import java.util.Arrays;
import java.util.Scanner;

//TLE
//https://yamakasa3.hatenablog.com/entry/2018/05/20/014730
public class Main {

	private static String[] dic;
	private static String[] ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		dic = new String[n];
		ans = new String[n];
		for(int i = 0; i < n; i++) {
			dic[i] = "Z";
		}
		int num = 0;
		int ansNum = 0;
		for(int i = 0; i < n; i++) {
			String a = sc.next();
			if("insert".equals(a)) {
				dic[num] = sc.next();
 				num++;
			} else {
				Arrays.sort(dic);
				if(binarySearch(sc.next(), num) == null) {
					ans[ansNum] = "no";
				} else {
					ans[ansNum] = "yes";
				}
				ansNum++;
			}
		}

		for(int i = 0 ; i < ansNum; i++ ) {
			System.out.println(ans[i]);
		}
	}
//	public static String linearSearch(String key, int n) {
//		int i = 0;
//		dic[n] = key;
//		while (!dic[i].equals(key)) {
//			i++;
//		}
//		if(i == n) {
//			return null;
//		}
//		return key;
//	}

	private static String binarySearch(String i, int n) {
		int left = 0;
		int right = n;
		while(left < right) {
			int mid = (left + right) / 2;
			if(dic[mid].equals(i)) {
				return i;
			} else if(dic[mid].compareTo(i) > 0) {
				right = mid;
			} else {
				left = mid+1;
			}
		}

		return null;
	}

}
