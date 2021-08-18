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
		//入力
		Scanner sc = new Scanner(System.in);
		String inStr = sc.next();

		//for文でまわすために配列に変換
		char[] inChar = inStr.toCharArray();

		//初期化
		stack1 = new int[inStr.length()];
		index1 = 0;
		stack2 = new int[inStr.length()][2];
		index2 = 0;

		for(int i = 0; i < inStr.length(); i++) {
			switch(inChar[i]) {
			case '\\':
				//indexをStack1にpushして終わり
				pushStack1(i);
				break;
			case '/':
				//Stack1からindexを取り出す
				int pop1 = popStack1();

				if(pop1 != -1) {
					//対応する'\\'があったらStack2からpopする
					int[] pop2 = popStack2();
					if(pop2[0] == -1) {
						//Stack2が空だったら、
						//今見つけた水たまりの情報をpushする
						pushStack2(pop1, i-pop1);
					} else if(pop1 >= pop2[0]) {
						//Stack2が空でない、
						//かつ過去に見つけた水たまりと繋がっていなかったら

						//popした過去の水たまりの情報をそのままStack2に戻す
						pushStack2(pop2[0], pop2[1]);
						//今見つけた水たまりの情報をpushする
						pushStack2(pop1, i-pop1);
					} else {
						//Stack2が空でない、
						//かつ過去に見つけた水たまりと繋がっていたら

						//過去の水たまりの合計用
						int pastArea = 0;

						//水たまりが繋がらないところまでさかのぼる
						while(pop2[0] != -1) {
							if(pop1 >= pop2[0]) {
								//水たまりが繋がらないところまで行きついたら

								//何もしない
								break;
							} else {
								//繋がる水たまりを見つけたら

								//過去の水たまりの面積を合計する
								pastArea += pop2[1];
							}
							//さらに水たまりの情報をさかのぼる
							pop2 = popStack2();
						}
						if(pop2[0] != -1) {
							//繋がっていない水たまりの情報をそのままStack2に戻す
							pushStack2(pop2[0], pop2[1]);
						}
						//過去の水たまりの面積と今の水たまりの情報をマージしてpushする
						pushStack2(pop1, i-pop1+pastArea);
					}

				}
				//index==-1だったら何もしない(対応する'\\'がないから)
				break;
			}
			//'_'のときは何もしない
		}

		//出力
		int sum = 0;
		int num = 0;
		for(int i = 0; i < index2; i++) {
			sum += stack2[i][1];
			num++;
		}
		System.out.println(sum);
		System.out.print(num);
		for(int i = 0; i < index2; i++) {
			System.out.print(" " + stack2[i][1]);
		}
		System.out.println();
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
