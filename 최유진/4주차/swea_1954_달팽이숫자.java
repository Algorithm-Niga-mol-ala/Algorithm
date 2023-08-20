package algo;

import java.util.Scanner;

public class swea_1954 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		//우, 하, 좌, 상 순서.
		int[] arrI = {0, 1, 0, -1};
		int[] arrJ = {1, 0, -1, 0};
		
		for(int tc = 1; tc <= T; tc++) {
			int currentI = 0;
			int currentJ = 0;
			//순서 인덱스.
			int d = 0;

			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			
			arr[currentI][currentJ] = 1;
			
			for(int i = 1; i < N*N; i++) {
				
				int newI = currentI + arrI[d];
				int newJ = currentJ + arrJ[d];
				
				//범위를 넘어가면, 또는 다음 채울 자리에 이미 값이 있으면 방향 바꾸기.
				if (newI >= N || newJ >= N || newI < 0 || newJ < 0 || arr[newI][newJ] != 0) {
					d++;
					if(d == 4)
						d = 0;
				} 
						
				currentI = currentI + arrI[d];
				currentJ = currentJ + arrJ[d];
				arr[currentI][currentJ] = i+1;				
			}
			
			System.out.println("#" + tc);
			for(int[] i : arr) {
				for(int j = 0; j < N; j++) {
					System.out.print(i[j] + " ");
				}
				System.out.println("");
			}

		}

	}

}
