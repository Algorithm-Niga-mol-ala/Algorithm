package java23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/*
필름의두께 D 3<=D<=13 정수
가로크기  W  1<=W<=20 정수
합격기준  K 1≤K≤D

 * */
public class Solution {
	static int D, W, K, ans, inject;
	static boolean[] visited, inject_A;
	static int[][] film, original;
	static int[] test;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {// T번의 반복
			sb.append("#" + tc + " ");
			String[] DWK = br.readLine().split(" ");

			D = Integer.parseInt(DWK[0]); // 필름의두께
			W = Integer.parseInt(DWK[1]); // 가로크기
			K = Integer.parseInt(DWK[2]); // 합격기준

			// 값 입력 받음
			visited = new boolean[D];
			inject_A = new boolean[D];

			film = new int[D][W];
			original = new int[D][W];
			test = new int[D];
			for (int i = 0; i < D; i++) {
				String[] row = br.readLine().split(" ");
				for (int j = 0; j < W; j++) {
					film[i][j] = Integer.parseInt(row[j]);
					original[i][j] = Integer.parseInt(row[j]);
				}
			} // film 값 입력 받기 ( 0 == A , 1 == B)
			ans = Integer.MAX_VALUE;
			selection(0);
			sb.append(ans).append("\n");
		} // T번의 반복
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}

	static void selection(int depth) {
		// film의 각 막에 대해서 약물을 넣을지 말지가 정해짐
		if (depth == D) {
			injection(0);
			for (int i = 0; i < D; i++) {
				if (visited[i]) {
					for (int j = 0; j < W; j++) {
						film[i][j] = original[i][j];
					}
				}
			}
			return;
		}
		// 약물을 넣을 막을 고르는 분기를 나눠줌
		visited[depth] = true;
		selection(depth + 1);
		visited[depth] = false;
		selection(depth + 1);

	}

	static void injection(int depth) {
		// selection에서 약물을 넣을지말지 결정한 것에 대해서 어떤 약물을 넣을지 결정
		if (depth == D) {
			inject = 0;
			for (int i = 0; i < D; i++) {
				if (visited[i]) {
					for (int j = 0; j < W; j++) {
						if (inject_A[i]) {
							film[i][j] = 0;

						} else {
							film[i][j] = 1;
						}

					}
					inject++;
					if (inject >= ans)
						return;
				}
			}
			if (test()) {
				ans = Math.min(ans, inject);
			}

			return;
		} // 기저조건

		// A가 true면 A를 넣고 false면 B를 넣는 식으로 분기를 나눠줌
		inject_A[depth] = true;
		injection(depth + 1);
		inject_A[depth] = false;
		injection(depth + 1);
	}

	static boolean test() {
		for (int i = 0; i < W; i++) {
			int st = 0;
			int st_cnt = 0;
			for (int j = 0; j < D; j++) {
				if (st != film[j][i]) {
					st = film[j][i];
					st_cnt = 1;
				} else {
					st_cnt++;
					if (st_cnt == K) {
						return true;
					}
				}

			}
		}
		return false;
	}
}
