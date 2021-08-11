package aizu.ITP1_5_B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Integer> hw = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		int h = 1;
		int w = 1;
		h = sc.nextInt();
		w = sc.nextInt();

		while ((h != 0) && (w != 0)) {
			hw.add(h);
			hw.add(w);

			h = sc.nextInt();
			w = sc.nextInt();
		}

		for (int k = 0; k < hw.size(); k += 2) {
			for (int i = 0; i < hw.get(k); i++) {
				if ((i == 0) || (i == hw.get(k) - 1)) {
					for (int j = 0; j < hw.get(k + 1); j++) {
						if (j < hw.get(k + 1) - 1) {
							System.out.print("#");
						} else {
							System.out.println("#");
						}
					}
				} else {
					for (int j = 0; j < hw.get(k + 1); j++) {
						if (j == 0) {
							System.out.print("#");
						} else if (j == hw.get(k + 1) - 1) {
							System.out.println("#");
						} else {
							System.out.print(".");
						}
					}
				}

			}
			System.out.println("");
		}
	}
}
