import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main10163_색종이 {

	public static void main(String[] args) throws IOException {
		// 색종이 영역은 카운팅 1씩 해주기
		// 겹치는 부분은 2 이상으로 입력됨
		// => 각 넓이는 1, 2, 3 ... 으로 적힌 것의 카운트 세주면 됨
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[][] color = new int[1001][1001];

		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int garo = Integer.parseInt(st.nextToken());
			int sero = Integer.parseInt(st.nextToken());
//			System.out.println(x1 + "," + y1 + "," + garo + "," + sero);

			// 색종이 영역은 카운팅
			for (int r = x1; r < x1 + garo; r++) {
				for (int c = y1; c < y1 + sero; c++) {
					color[r][c] = i; // 잘 읽어봐~~~~ [주의]
				}
			}
		} // i for

		int k = 1; // 색종이 영역은 1부터 시작
		int cnt = 0; // 각 영역 넓이 세주기 위한 변수
		while (k <= N) { // 색종이 영역이 1, 2, ... 일 때 개수 세주기
			cnt = 0;
			for (int i = 0; i < 1001; i++) {
				for (int j = 0; j < 1001; j++) {
					if (color[i][j] == k)
						cnt++;
				}
			}
			System.out.println(cnt);
			k++;
		} // while
	}

}
