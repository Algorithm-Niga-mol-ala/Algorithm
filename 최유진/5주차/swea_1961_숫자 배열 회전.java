package algo;

import java.util.Scanner;

public class swea_1961 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];

			// 배열 받기.
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			// 90도를 받자
			String[] arr90 = new String[N]; // {"741", "852", "963"} 형태로 받을 예정이다.
			for (int j = 0; j < N; j++) {
				StringBuilder sb = new StringBuilder();
				for (int i = N - 1; i >= 0; i--) {
					sb.append(arr[i][j]);
				}
				arr90[j] = sb.toString();
			}

			// 180도를 받자
			String[] arr180 = new String[N]; 
			for (int i = N - 1; i >= 0; i--) {
				StringBuilder sb = new StringBuilder();
				for (int j = N - 1; j >= 0; j--) {
					sb.append(arr[i][j]);
				}
				arr180[N - 1 - i] = sb.toString();
			}

			// 270도를 받자
			String[] arr270 = new String[N]; 
			for (int j = N - 1; j >= 0; j--) {
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < N; i++) {
					sb.append(arr[i][j]);
				}
				arr270[N-1-j] = sb.toString();
			}
			
			System.out.println("#" + tc);
			for(int i = 0; i < N; i++) {
				System.out.print(arr90[i] + " " + arr180[i] + " " + arr270[i]);
				System.out.println(" ");
			}

		}
	}

}
