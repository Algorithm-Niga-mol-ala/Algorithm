package bj;

import java.util.Scanner;

public class No_15652_N과M4 {
	
	static int N;
	static int M;
	static int arr[];
	
	static void nm4(int idx, int st) {
		// 기저
		if ( idx == M ) {
			for ( int i : arr ) {
				System.out.print(i+" ");
			} System.out.println();
			return;
		}
		
		// 재귀
		for (int i=st; i<=N; i++) {
			arr[idx] = i;
			nm4(idx+1, i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[M];
		
		nm4(0, 1);
	}

}
