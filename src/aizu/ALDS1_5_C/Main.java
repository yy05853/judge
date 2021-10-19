package aizu.ALDS1_5_C;

import java.util.Scanner;

// コッホ曲線
public class Main {
	
	// 座標上の点Pを表すクラス
	static class P {
		double x, y;
		P(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}
	
	// コッホ曲線の頂点の座標を順番に出力する再帰関数
	static void koch(
			int n,		// 再帰の深さ 
			P p1, 		// 始点
			P p2		// 終点
			) {
		
		// 再帰の深さが0なら処理を終了する
		if(n == 0) return;
		
		// P型のクラスを3つ宣言して初期化する
		P s = new P(0.0, 0.0);
		P t = new P(0.0, 0.0);
		P u = new P(0.0, 0.0);
		
		// 与えられた式を使って、s,tの座標を求める
		s.x = (2.0 * p1.x + p2.x)/3.0;
		s.y = (2.0 * p1.y + p2.y)/3.0;
		t.x = (p1.x + 2.0 * p2.x)/3.0;
		t.y = (p1.y + 2.0 * p2.y)/3.0;
		
		// 与えられた式を使って、uの座標を求める
		u.x = (t.x - s.x) / 2.0 - (t.y - s.y) * Math.sqrt(3.0) / 2.0 + s.x;
		u.y = (t.x - s.x) * Math.sqrt(3.0) / 2.0 + (t.y - s.y) / 2.0 + s.y; 
		
		// 深さを1つ下げ、p1とsを始点終点として再帰呼び出しをする
		koch(n-1, p1, s);
		System.out.println(s.x + " " + s.y);
		// 深さを1つ下げ、sとuを始点終点として再帰呼び出しをする
		koch(n-1, s, u);
		System.out.println(u.x + " " + u.y);
		// 深さを1つ下げ、uとtを始点終点として再帰呼び出しをする
		koch(n-1, u, t);
		System.out.println(t.x + " " + t.y);
		// 深さを1つ下げ、tとp2を始点終点として再帰呼び出しをする
		koch(n-1, t, p2);
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			System.out.println(0.000000 + " " + 0.0000000);
			// p1,p2で再帰関数を呼び出す
			koch(n, new P(0.0, 0.0), new P(100.0, 0.0));
			System.out.println(100.000000 + " " + 0.000000);
		}
	}

}
