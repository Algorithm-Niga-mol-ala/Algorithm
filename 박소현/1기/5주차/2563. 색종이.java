import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2563_색종이 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 색종이 수

		// 전체 도화지 크기의 배열 생성
		int[][] color = new int[100][100];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()); // 왼쪽 하단 x좌표
			int y = Integer.parseInt(st.nextToken()); // 왼쪽 상단 y좌표
//			System.out.println(x);
//			System.out.println(y);

			// 색종이에 해당하는 영역들은 1로 바꿔주기
			for (int r = x; r < x + 10; r++) {
				for (int c = y; c < y + 10; c++) {
					color[r][c]++;
				}
			}
		} // i for

//		System.out.println(Arrays.deepToString(color));

		// 넓이 구하기
		int cnt = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (color[i][j] > 0)
					cnt++;
			}
		}

		// 출력
		System.out.println(cnt);

	}

}
