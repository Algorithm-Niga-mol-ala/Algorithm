package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class bj_2960 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;
		int ans = 0;
		
		int[] arr = new int[N+1];
		for(int i = 2; i <= N; i++) {
			arr[i] = 1; //배열에 1 이 있다면 있는 수, 0이면 지워진 수.
		}
		
		while(getMinNum(arr) != -1) {
			
			int minN = getMinNum(arr);
			arr[minN] = 0; //가장 작은 수를 지운다.
			cnt++;
			
			if(cnt == K) {
				ans = minN;
				break;
			}
			for(int i = minN + 1; i <= N; i++) {
				if(arr[i] == 1 && i % minN == 0) {
					arr[i] = 0; //지운다.
					cnt++;
					if(cnt == K) {
						ans = i;
						break;
					}
				}
			}
			
		}
		
		System.out.println(ans);
	}
	
	public static int getMinNum(int[] arr) { //배열 중 안 지워졌는데 가장 작은 수를 구한다.
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				return i;
			}
		}
		return -1;
	}

}
