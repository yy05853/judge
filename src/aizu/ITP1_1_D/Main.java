package aizu.ITP1_1_D;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();

		int hour = s / 3600;
		int minute = (s - hour*3600) / 60;
		int second = s - hour*3600 - minute*60;

		System.out.println(hour + ":" + minute + ":" + second);

	}

}
