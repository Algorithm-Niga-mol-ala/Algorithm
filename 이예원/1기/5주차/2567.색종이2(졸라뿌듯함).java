
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 색종이의 수

		boolean[][] paper = new boolean[101][101];
		int len = paper.length;

		for (int i = 0; i < N; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int a = x; a < x + 10; a++) {
				for (int b = y; b < y + 10; b++) {
					paper[a][b] = true;
				}
			}

		} // 색종이 값 입력

		// 둘레를 구해보자
		// 4방 탐색 해서 내가 false고 내 옆이 true이면 true개수 만큼 세기
		// 오목처럼

		// 상 하 좌 우
		int[] dr = { 1, -1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };

		int d = 0;

		int cnt = 0;

		for (int r = 0; r < len; r++) {
			for (int c = 0; c < len; c++) {

				if (paper[r][c] == false) {// 내가 서있는 곳이 false일 때

					for (d = 0; d < 4; d++) {

						int nr = r + dr[d];
						int nc = c + dc[d];

						// 상하좌우 살펴봐서 배열 범위 안에 들어오고 true이면
						if (nr < len && nr >= 0 && nc < len && nc >= 0 && paper[nr][nc]) {
							cnt++; // 카운트++
						} else
							continue; // 아니면 넘어가

					}
				} else
					continue; // 내가 서있는 곳이 true이면 넘어가기

			}
		} // 배열 순회하는 for문

		System.out.println(cnt);

	}

}
