package aizu.ITP1_6_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		boolean[] s = new boolean[13];
		boolean[] h = new boolean[13];
		boolean[] c = new boolean[13];
		boolean[] d = new boolean[13];

		for(int i = 0; i < 13; i++) {
			s[i] = false;
			h[i] = false;
			c[i] = false;
			d[i] = false;
		}

		for(int i = 0; i < n; i++) {
			String a = sc.next();
			int b = sc.nextInt();

			switch(a) {
			case "S" :
				s[b-1] = true;
				break;
			case "H" :
				h[b-1] = true;
				break;
			case "C" :
				c[b-1] = true;
				break;
			case "D" :
				d[b-1] = true;
				break;
			}
		}

		for(int i = 0; i < 13; i++) {
			if(!s[i]) {
				System.out.println("S " + (i+1));
			}
		}
		for(int i = 0; i < 13; i++) {
			if(!h[i]) {
				System.out.println("H " + (i+1));
			}
		}
		for(int i = 0; i < 13; i++) {
			if(!c[i]) {
				System.out.println("C " + (i+1));
			}
		}
		for(int i = 0; i < 13; i++) {
			if(!d[i]) {
				System.out.println("D " + (i+1));
			}
		}





	}

}
