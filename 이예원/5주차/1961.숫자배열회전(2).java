package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Swea_1961_숫자배열회전 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine()); // tc 입력

		for (int tc = 1; tc <= T; tc++) {

			// N입력하고 배열 생성
			int N = Integer.parseInt(br.readLine());

			int[][] num = new int[N][N];

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					num[i][j] = Integer.parseInt(st.nextToken());
				}
			} // 여기까지 배열 값 입력받음

			// 90도 회전
			int[][] newNum1 = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					newNum1[i][j] = num[N - j - 1][i];
				}
			}

			// 180도 회전
			int[][] newNum2 = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					newNum2[i][j] = newNum1[N - j - 1][i];
				}
			}

			// 270도 회전
			int[][] newNum3 = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					newNum3[i][j] = newNum2[N - j - 1][i];
				}
			}

			System.out.println("#" + tc);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(newNum1[i][j]);
				}
				System.out.print(" ");

				for (int j = 0; j < N; j++) {
					System.out.print(newNum2[i][j]);
				}
				System.out.print(" ");

				for (int j = 0; j < N; j++) {
					System.out.print(newNum3[i][j]);
				}
				System.out.print(" ");
				System.out.println();

			}

		} // tc도는 for문

	}

}
