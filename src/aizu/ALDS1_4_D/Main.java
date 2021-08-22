package aizu.ALDS1_4_D;

import java.util.Scanner;

public class Main {
	public static int n;
    public static int k;
    public static int []w;

	public static void main(String[] args) {

		//入力
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		w = new int[n];

		int max = 0;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			w[i] = sc.nextInt();

			if(w[i] > max) max = w[i];
			sum++;
		}
		sc.close();

		long ans = solve(max, sum);
		System.out.println(ans);
	}
	public static long solve(int max, int sum) {
		long left = 0;
		long right = 10000 * 100000;
		long mid;

		while(right - left > 1) {
			mid = (left + right) / 2;
			int v = check(mid);
			//チェック結果がnより以上なら
			//midは最大積載量の最小値以上なので、rightを更新する
			if(v >= n) right = mid;
			//チェック結果がnより小さければ
			//midは最大積載量の最小値に満たないので、leftを更新する
			else left = mid;
		}
		return right;
	}
	private static int check(long mid) {
		//配列wの添え字
		int i = 0;
		//トラックの数だけ繰り返す
		for(int j = 0; j < k; j++) {
			long s = 0;
			//配列wのサブセットの総重量がmid以下の間繰り返す
			while(s + w[i] <= mid) {
				//配列wのサブセットの総重量を求める
				s += w[i];
				//添え字iをインクリメント
				i++;
				//添え字iが荷物の数と一致するなら荷物の数を返す
				if(i == n) return n;
			}

		}
		//配列wのサブセットの数がトラックの数を超えたらiを返す
		return i;
	}

}
