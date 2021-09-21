package aizu.ALDS1_2_C;

import java.util.Scanner;

// 安定なソート
public class Main {

	public static int n;
	public static String[] bubble;
	public static String[] selection;

	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		bubble = new String[n];
		for(int i = 0; i< n; i++) {
			bubble[i] = sc.next();
		}
		selection = new String[n];
		for(int i = 0; i< n; i++) {
			selection[i] = bubble[i];
		}

		bubbleSort();
		selectionSort();

		// 出力
		System.out.print(bubble[0]);
		for(int i = 1; i< n; i++) {
			System.out.print(" " + bubble[i]);
		}

		System.out.println();

		System.out.println("Stable");


		System.out.print(selection[0]);

		for(int i = 1; i< n; i++) {
			System.out.print(" " + selection[i]);
		}

		boolean isStable = true;
		for(int i = 0; i< n; i++) {
			if(!bubble[i].equals(selection[i]))
				isStable = false;
		}
		System.out.println();

		if(isStable)
			System.out.println("Stable");
		else
			System.out.println("Not stable");

	}

	// バブルソート
	public static void bubbleSort() {

		boolean flag = true;
		int i = 0;
		while(flag) {
			flag = false;
			for(int j = n-1; j > i; j--) {
				if(Integer.parseInt(bubble[j].substring(1))
						< Integer.parseInt(bubble[j-1].substring(1))) {
					String tmp = bubble[j];
					bubble[j] = bubble[j-1];
					bubble[j-1] = tmp;
					flag = true;
				}
			}
			i++;
		}


	}

	// 選択ソート
	public static void selectionSort() {

		for(int i = 0; i < n; i++) {
			int minj = i;
			for(int j = i; j < n; j++) {
				if(Integer.parseInt(selection[j].substring(1))
						< Integer.parseInt(selection[minj].substring(1))) {
					minj = j;
				}
			}
			if(i != minj) {
				String tmp = selection[i];
				selection[i] = selection[minj];
				selection[minj] = tmp;

			}
		}
	}
}
