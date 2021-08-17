package aizu.ALDS1_3_D;

import java.util.Scanner;

public class Main {

	//stack
	public static int[] stack1;
	public static int index1;

	//stack2
	public static int[][] stack2;
	public static int index2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inStr = sc.next();
		char[] inChar = inStr.toCharArray();

		//初期化
		stack1 = new int[inStr.length()];
		index1 = 0;
		stack2 = new int[inStr.length()][2];
		index2 = 0;

		for(int i = 0; i < inStr.length(); i++) {
			switch(inChar[i]) {
			case '\\':
				pushStack1(i);
				break;
			case '/':
				int pop1 = popStack1();

				if(pop1 != -1) {
					int[] pop2 = popStack2();
					if(pop2[0] == -1) {
						pushStack2(pop1, i-pop1);
					} else if(pop1 >= pop2[0]) {
						pushStack2(pop2[0], pop2[1]);
						pushStack2(pop1, i-pop1);
					} else {
						while(pop1 != -1) {
							pushStack2(pop1, i-pop1+pop2[1]);
							pop1 = popStack1();
							if(pop1 != -1) {
								pop2 = popStack2();

							}
						}
					}

				}
				break;
			}
		}
		for(int i = 0; i < index2; i++) {
			System.out.println(stack2[i][1]);
		}
	}

	public static void pushStack1(int index) {
		stack1[index1++] = index;
	}
	public static int popStack1() {
		if(index1 == 0) return -1;
		return stack1[--index1];
	}

	public static void pushStack2(int index, int area) {
		stack2[index2][0] = index;
		stack2[index2][1] = area;
		index2++;
	}
	public static int[] popStack2() {
		if(index2 == 0) return new int[] {-1, -1};
		return stack2[--index2];
	}

}
