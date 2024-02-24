import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		String[] RC = br.readLine().split(" ", 0);
		int R = Integer.parseInt(RC[0]);
		int C = Integer.parseInt(RC[1]);

		int[] dr = new int[] { -1, 0, 1, 0 };
		int[] dc = new int[] { 0, 1, 0, -1 };// 북 동 남 서

		int[][] map = new int[R][C];
		int[][] fire_map = new int[R][C];
		boolean[][] checked = new boolean[R][C];
		
		Queue<int[]> fire_q = new LinkedList<>();
		Queue<int[]> q = new LinkedList<>();
		
		for(int i=0; i<R;i++) {
			for(int j=0; j<C; j++) {
				fire_map[i][j] = Integer.MAX_VALUE;
			}
		}
		
		for (int i = 0; i < R; i++) {
			String row = br.readLine();
			for (int j = 0; j < C; j++) {
				if (row.charAt(j) == '#') {
					map[i][j] = -1;
					checked[i][j] = true;
					fire_map[i][j] = -1;
				} else if (row.charAt(j) == 'J') {
					q.add(new int [] {i,j,0});
					checked[i][j] = true;
				} else if (row.charAt(j) == 'F') {
					map[i][j] = -1;
					fire_q.add(new int[] { i, j, 0 });
					fire_map[i][j] = 0;
					checked[i][j] = true;
				}
			}
		}
		
		while (!fire_q.isEmpty()) {
			int[] now = fire_q.poll();
			int r = now[0];
			int c = now[1];
			int time = now[2];
			for (int k = 0; k < 4; k++) {
				int nr = r + dr[k];
				int nc = c + dc[k];
				if (nr >= 0 & nr < R && nc >= 0 && nc < C && time+1<fire_map[nr][nc]) {
					fire_q.add(new int[] { nr, nc, time + 1 });
					fire_map[nr][nc] = time + 1;
				}
			}
		}
		
//		for(int i=0; i<R;i++) {
//			for(int j=0; j<C; j++) {
//				System.out.print(fire_map[i][j]);
//			}
//			System.out.println();
//		}
		int ans = -1;
		loop: while (!q.isEmpty()) {
			int[] now = q.poll();
			int r = now[0];
			int c = now[1];
			int time = now[2];
//			System.out.println("r: "+r + " c: "+c + " time : "+time);
			for (int k = 0; k < 4; k++) {
				int nr = r + dr[k];
				int nc = c + dc[k];
				if (nr<0 || nr >= R || nc<0 ||nc >= C ) {
					ans = time + 1;
					break loop;
				}
				if (nr >= 0 & nr < R && nc >= 0 && nc < C && !checked[nr][nc] && time+1 < fire_map[nr][nc]) {
					q.add(new int[] { nr, nc, time + 1 });
					checked[nr][nc] = true;
				}
			}
		}
		
		if (ans == -1) {
			System.out.println("IMPOSSIBLE");
		} else {
			System.out.println(ans);
		}

	}

}
