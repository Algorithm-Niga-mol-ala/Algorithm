import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2567_색종이2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 색종이 수

		int[][] color = new int[100][100];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			// 색종이에 해당하는 영역들은 1로 바꿔주기
			for (int r = x; r < x + 10; r++) {
				for (int c = y; c < y + 10; c++) {
					color[r][c]++;
				}
			}
		}
//		System.out.println(Arrays.deepToString(color));

		// 우하좌상
		int[] dr = { 0, 1, 0, -1 };
		int[] dc = { 1, 0, -1, 0 };

		// 0의 개수 = 둘레
		int cnt = 0;

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				// 4방 탐색으로 0의 개수를 찾겠따
				for (int d = 0; d < 4; d++) {
					if (color[i][j] > 0) {
						int nr = i + dr[d];
						int nc = j + dc[d];
						if (nr >= 0 && nr < 100 && nc >= 0 && nc < 100) {
							if (color[nr][nc] == 0)
							cnt++;
						}
						// 만약 색종이가 x축과 y축과 겹쳐져서 놓이면 해당 길이도 더해줘야 하므로
						if (nr < 0 || nr >= 100 || nc < 0 || nc >= 100) {
								cnt++;
						}
					}
				} // 4방탐색 for
			}
		} // for

		System.out.println(cnt);

	}

}
