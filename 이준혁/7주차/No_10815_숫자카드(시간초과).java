package bj;

import java.util.Arrays;
import java.util.Scanner;

public class No_10815_숫자카드 {
	
	static int[] arr;
	
	static int binSear(int idx) {
		int left = 0;
		int right = arr.length-1;
		int mid;
		
		while (left <= right) {
			mid = (left+right)/2;
			if (arr[mid] < idx) {
				left = mid+1;
			} else if (arr[mid] > idx) {
				right = mid-1;
			} else {
				return mid;
			}
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		arr = new int[N];
		
		for (int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		
		Arrays.sort(arr);
		
		for(int i=0; i<M; i++) {
			int tmp = binSear(sc.nextInt());
			if (tmp == -1) {
				System.out.print(0+" ");
			} else {
				System.out.print(1+" ");
			}
		}
	}

}
