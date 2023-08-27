import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// 홀수 N 입력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());

		int M = Integer.parseInt(br.readLine());

		int[][] map = new int[N][N]; // 배열 만들기

		// 하 우 상 좌
		int[] dr = { 1, 0, -1, 0 };
		int[] dc = { 0, 1, 0, -1 };

		int d = 0;
		int r = 0;
		int c = 0;

		// 가장 큰 값부터 1까지 입력해주기
		for (int i = N * N; i >= 1; i--) {

			map[r][c] = i;

			// 다음자리 인덱스
			int nr = r + dr[d];
			int nc = c + dc[d];

			// 범위를 벗어나거나 이미 값이 입력돼 있으면 방향 전환
			if (nr >= N || nr < 0 || nc >= N || nc < 0 || map[nr][nc] != 0) {
				d = (d + 1) % 4;
			}

			r = r + dr[d];
			c = c + dc[d]; // 자리를 이동시킴

		} // 값 입력

		// 출력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				bw.write(map[i][j] + " ");
			}
			bw.write("\n");
		}

		// M의 값을 가진 자리의 인덱스 출력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == M) {
					bw.write((i + 1) + " " + (j + 1));
				}
			}
		}
		
		bw.flush();
		bw.close();

	}// main

}
