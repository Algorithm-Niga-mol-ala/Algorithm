package algo;

import java.util.Arrays;
import java.util.Scanner;

public class bj2567 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] map = new int[102][102];

		for (int i = 0; i < N; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			for (int j = n; j < n + 10; j++) {
				for (int k = m; k < m + 10; k++) {
					if(map[j][k] == 0 ) {
						map[j][k] = 1;
					}
				}
			}
		}
		
		int[] dr = { -1, 0, 1, 0};
		int[] dc = {0, 1, 0, -1};
		int answer = 0;

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {

				if (map[i][j] == 1) {	
					// 4방 탐색
					for (int k = 0; k < 4; k++) {
						// 벽 쪽이라면 (비어있다면 둘레에 해당하는 부분이므로 answer++)
						if (i + dr[k] < 0 || i + dr[k] >= 100 || j + dc[k] < 0 || j + dc[k] >= 100) {
							answer++;
							// 0과 붙어있는 부분이라면 둘레이므로 answer++;
						} else if (map[i + dr[k]][j + dc[k]] == 0) {
							answer++;
						}
					}
				}

			}
		}

		System.out.println(answer);

	}

}
