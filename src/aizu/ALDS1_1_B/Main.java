package aizu.ALDS1_1_B;

import java.util.Scanner;

// ユークリッドの互除法
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		if(x < y) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		while(y > 0) {
			int r = x % y;
			x = y;
			y = r;
		}

		System.out.println(x);
	}

}
