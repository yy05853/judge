package aizu.ITP1_4_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.print(a / b);
		System.out.print(" ");
		System.out.print(a % b);
		System.out.print(" ");
		System.out.print(String.format("%.10f", (double)a / (double)b));
	}

}
