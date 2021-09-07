package aizu.ALDS1_3_B;

import java.util.Scanner;

public class Main {
	public static final int MAX = 200000;

	public static String[][] Q = new String[MAX][2];
	public static int head;
	public static int tail;

	public static void main(String[] args) throws Exception {
		// 入力
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int q = sc.nextInt();
		for(int i = 0; i < n; i++) {
			enqueue(sc.next(), sc.next());
		}
		sc.close();

		int elapsedTime = 0;
		String[] tmp;
		// 出力
		while(!isEmpty()) {
			tmp = dequeue();
			if(Integer.parseInt(tmp[1]) > q) {
				tmp[1] = String.valueOf((Integer.parseInt(tmp[1])-q));
				enqueue(tmp[0], tmp[1]);
				elapsedTime += q;
			} else {
				elapsedTime += Integer.parseInt(tmp[1]);
				System.out.println(tmp[0] + " " + elapsedTime);
			}
		}



	}

	public static void initialize() {
		head = 0;
		tail = 0;
	}

	public static boolean isEmpty() {
		return head == tail;
	}

	public static boolean isFull() {
		return head == (tail + 1) % MAX;
	}

	public static void enqueue(String name, String time) throws Exception {
		if(isFull()) {
			// エラー
			throw new Exception();
		}
		Q[tail][0] = name;
		Q[tail][1] = time;
		if(tail + 1 == MAX) {
			tail = 0;
		} else {
			tail++;
		}
	}

	public static String[] dequeue() throws Exception{
		if(isEmpty()) {
			// エラー
			throw new Exception();
		}
		String[] x = Q[head];
		if(head + 1 == MAX) {
			head = 0;
		} else {
			head++;
		}
		return x;
	}

}
