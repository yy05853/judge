package ac.abc217.b;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();

		boolean abc = true;
		boolean arc = true;
		boolean agc = true;
		boolean ahc = true;

		if("ABC".equals(s1) || "ABC".equals(s2) || "ABC".equals(s3)) {
			abc = false;
		}
		if("ARC".equals(s1) || "ARC".equals(s2) || "ARC".equals(s3)) {
			arc = false;
		}
		if("AGC".equals(s1) || "AGC".equals(s2) || "AGC".equals(s3)) {
			agc = false;
		}
		if("AHC".equals(s1) || "AHC".equals(s2) || "AHC".equals(s3)) {
			ahc = false;
		}

		if(abc) {
			System.out.println("ABC");
			return;
		}
		if(arc) {
			System.out.println("ARC");
			return;
		}
		if(agc) {
			System.out.println("AGC");
			return;
		}
		System.out.println("AHC");
	}
}
