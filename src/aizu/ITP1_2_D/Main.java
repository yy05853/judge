package aizu.ITP1_2_D;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();

		if((0 <= x-r) && (0 <= y-r) && (w >= x+r) && (h >= y+r)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
