package ac.abc217.a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();

		if(s.compareTo(t) < 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
