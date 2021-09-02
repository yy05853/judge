package aizu.ALDS1_5_A_algo1;

public class Main {
	public static int n = 2;
	public static boolean[] S = new boolean[n];

	public static void main(String[] args) {
		for(int i = 0; i < n; i++) {
			S[i] = false;
		}
		rec(0);
	}

	private static void rec(int i) {
		System.out.println("rec(" + (i) + ")");
		if(i == n) {
			System.out.print("【");
			for(int j = 0; j < n; j++) {

				if(S[j]) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println("】");
			return;
		}

		rec(i+1);

		S[i] = true;
		for(int j = 0; j < n; j++) {
			if(S[j]) {
				System.out.print("1 ");
			} else {
				System.out.print("0 ");
			}
		}
		System.out.println();

		rec(i+1);

		S[i] = false;
		for(int j = 0; j < n; j++) {
			if(S[j]) {
				System.out.print("1 ");
			} else {
				System.out.print("0 ");
			}
		}
		System.out.println();
	}

}
