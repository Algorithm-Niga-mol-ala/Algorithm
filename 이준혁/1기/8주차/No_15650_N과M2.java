package bj;

import java.util.Scanner;

public class No_15650_N과M2 {
	
	static int N;
	static int M;
	static int[] arr;
	
	static void nm2(int idx, int st) {
		// 기저
		if (idx == M) {
			for (int i : arr) {
				System.out.print(i+" ");
			} System.out.println();
			return;
		}
		
		// 재귀
		for (int i=st; i<=N; i++) {
			arr[idx] = i;
			nm2(idx+1, i+1);
			
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[M];
		
		nm2(0, 1);
		
	}

}
