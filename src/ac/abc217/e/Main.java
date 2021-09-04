package ac.abc217.e;

import java.util.Scanner;

// WA
public class Main {

	public static final int BIG_NUM = 100000000;
	public static int[] queue = new int[BIG_NUM];
	public static int head = 0;
	public static int tail = 1;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			int j = sc.nextInt();
			if(j == 1) {
				int k = sc.nextInt();
				enqueue(k);
			}
			if(j == 2) {
				System.out.println(dequeue());
			}
			if(j == 3) {
				quick_sort(head, tail-head-2);
			}

		}
	}

    static void quick_sort(int left, int right) {
        if (left>=right) {
            return;
        }
        int p = queue[(left+right)/2+head];
        int l = left+head, r = right+head, tmp;
        while(l<=r) {
            while(queue[l] < p) { l++; }
            while(queue[r] > p) { r--; }
            if (l<=r) {
                tmp = queue[l]; queue[l] = queue[r]; queue[r] = tmp;
                l++; r--;
            }
        }
        quick_sort(left, r);  // ピボットより左側をクイックソート
        quick_sort(l, right); // ピボットより右側をクイックソート
    }

//	private static void shellSort() {
//		// シェルソート
//		int m = 1;
//		int[] g = new int[100];
//		g[0] = 1;
//		while(g[m-1] < tail - head) {
//			g[m] = g[m-1]*3+1;
//			m++;
//		}
//
//		for(int i = m-1; i >= 0; i--) {
//			// 挿入ソート
//			insertionSort(g[i]);
//		}
//	}
//
//	private static void insertionSort(int g) {
//		// 挿入ソート
//
//		for(int i = head+g; i < tail-1; i++) {
//			int v = queue[i];
//			int j = i-g;
//			while((j >= head) && (queue[j]) > v ) {
//				queue[j+g] = queue[j];
//				j = j - g;
//			}
//			queue[j+g] = v;
//		}
//	}

	public static void enqueue(int x) {
		queue[tail-1] = x;
		tail++;
	}

	public static int dequeue() {
		head++;
		return queue[head-1];
	}
}
