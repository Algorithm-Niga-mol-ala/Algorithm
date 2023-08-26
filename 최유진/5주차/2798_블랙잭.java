package algo;

import java.util.Scanner;

public class bj2798 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int maxSum = 0;

    //3중 for문으로 M은 넘지 않되 최대합 구하기..
		for(int i = 0; i < N-2; i++) {
			for(int j = i+1; j < N-1; j++) {
				for(int k = j+1; k < N; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					if (sum <= M)
						maxSum = Math.max(maxSum, arr[i] + arr[j] + arr[k]);
				}
			}
		}
		
		System.out.println(maxSum);
		
	}

}
