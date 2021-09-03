package aizu.ALDS1_5_A_naoto;

import java.util.Scanner;

public class Main {

	public static final int NUM = 2000;

	public static boolean check[];
	public static int N;
	public static int table[];


	public static void main(String[] args) {
		// なんで+1してる？
		check = new boolean[NUM+1];

		// 入力
		Scanner sc = new Scanner(System.in);
		// 配列tableの個数
		N = sc.nextInt();
		// 足し算に使える数値の配列
		table = new int[N];
		for(int i = 0; i < N; i++) {
			table[i] = sc.nextInt();
		}

		recursive(0,0);

		// 作りたい数値の個数
		int num_query = sc.nextInt();

		int tmp;
		StringBuilder ans = new StringBuilder();
		// 作りたい数値の個数分繰り返す
		for(int loop = 0; loop < num_query; loop++) {
			// 作りたい数値を標準入力から受け取る
			tmp = sc.nextInt();
			if(check[tmp]) {
				// 作れるならyes
				ans.append("yes\n");
			} else {
				// 作れないならno
				ans.append("no\n");
			}
		}

		// 出力
		System.out.print(ans.toString());
	}

	public static void recursive(int index, int sum) {
		// indexが「足し算に使える数値の配列」の個数と一致するなら
		if(index == N) {
			// booleanの配列checkのsum番目にtrueをいれる
			check[sum] = true;
			return;
		}

		recursive(index+1, sum);
		// sum+「足し算に使える数値の配列」の添え字indexが2000より小さいなら
		if(sum+table[index] <= NUM) {

			recursive(index+1, sum+table[index]);
		}
	}

}
