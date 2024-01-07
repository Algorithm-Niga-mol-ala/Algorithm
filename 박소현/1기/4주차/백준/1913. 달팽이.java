import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1913_달팽이 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int L = Integer.parseInt(br.readLine());

		int[][] snail = new int[N][N];

		// 하 우 상 좌
		int[] dr = { 1, 0, -1, 0 };
		int[] dc = { 0, 1, 0, -1 };
		int d = 0; // 아래쪽부터 방향 시작

		// 현재 위치
		int r = 0;
		int c = 0;

		// 처음에 적힐 숫자
		int n = N * N;

		while (0 < n && n <= N * N) {
			snail[r][c] = n; // 해당 칸에 숫자 입력, 첫 시작은 N*N

			// 이동할 위치
			int nr = r + dr[d];
			int nc = c + dc[d];

			// 벽을 만나거나 이미 채워진 자리와 만날 경우 방향 전환
			if (nr < 0 || nc < 0 || nr >= N || nc >= N || snail[nr][nc] > 0) {
				d = (d + 1) % 4;
			}

			// 이동하면서 숫자 넣기
			r += dr[d];
			c += dc[d];
			n--;

		}

		// 출력
		for (int[] arr : snail) {
			for (int a : arr) {
				sb.append(a + " ");
			}
			sb.append("\n");
		}

		// 좌표 구하기
		// 좌표는 배열의 인덱스에 +1해줘야 함
		for (int i = 0; i < snail.length; i++) {
			for (int j = 0; j < snail.length; j++) {
				if (snail[i][j] == L)
					sb.append((i + 1) + " " + (j + 1));
			}
		}
		System.out.println(sb);
		br.close();
	}

}
