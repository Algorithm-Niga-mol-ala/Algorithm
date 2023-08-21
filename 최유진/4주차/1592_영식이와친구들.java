package algo;

import java.util.Scanner;

public class bj1592 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		
		int[] arr = new int[N];
		int currentIdx = 0;
		int cnt = 0;
		for(;;) {
			arr[currentIdx]++;
			if(arr[currentIdx] == M) {
				break;
			}
			//짝수면 반시계
			if(arr[currentIdx] % 2 == 0) {
				currentIdx -= L;
        //인덱스가 범위를 넘어갈 때 제한 걸어주기
				while(currentIdx < 0) {
					currentIdx = N + currentIdx;
				}
				
			} else {
				currentIdx += L;
				while(currentIdx >= N) {
					currentIdx = currentIdx - N;
				}
			}
			cnt++;
		}
		System.out.println(cnt);

	}

}
