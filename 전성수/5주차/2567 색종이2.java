
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int[][] map = new int[101][101];
		// 0~100 까지

		for (int i = 0; i < T; i++) {
			String[] XY = br.readLine().split(" ");
			// x y 좌표
			int[] XYs = new int[2];
			XYs[0] = Integer.parseInt(XY[0]); // X
			XYs[1] = Integer.parseInt(XY[1]); // Y
			int x = XYs[0];
			int y = XYs[1];
			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					
						map[j][k] = 1;
				}
			}
		} // 색종이가 올라간 부분을 true로 바꿔줌
			// 완성된 도화지
		int[] dx = { 0, 0, 1, -1 }; // 동 서 남 북 탐색
		int[] dy = { 1, -1, 0, 0 };
		int cnt = 0;
		//점의 사방을 탐색해서 가장자리면 카운트
		for (int i = 1; i < 101; i++) {
			for (int j = 1; j < 101; j++) {
				if (map[i][j] == 1) {
					for (int k = 0; k < 4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];

						if (nx >= 1 && nx <= 100 && ny >= 1 && ny <= 100 && map[nx][ny] == 0)
							cnt++;
						else if (nx < 1 || nx > 100 || ny < 1 || ny > 100)
							cnt++;
					}
				}
			}
		}
			sb.append(String.valueOf(cnt));
			bw.write(sb.toString());
			bw.flush();
			bw.close();
			br.close();
		
	}
}
