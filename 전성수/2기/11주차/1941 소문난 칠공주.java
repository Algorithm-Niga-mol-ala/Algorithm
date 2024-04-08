import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static boolean[][] checked;
	static String[][] map;
	static int[] dr = new int[] { -1, 0, 1, 0 };
	static int[] dc = new int[] { 0, 1, 0, -1 };
	static int ans = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		map = new String[5][5];
		checked = new boolean[5][5];

		for (int i = 0; i < 5; i++) {
			String[] row = br.readLine().split("", 0);
			for (int j = 0; j < 5; j++) {
				map[i][j] = row[j];
			}
		}

		dfs(0, 0);
		System.out.println(ans);

	}

	public static void dfs(int st, int depth) {
		if (depth == 7) {
			if (check()) {
				ans++;
			}
			return;
		}

		for (int k = st; k < 25; k++) {
			checked[k / 5][k % 5] = true;
			dfs(k + 1, depth + 1);
			checked[k / 5][k % 5] = false;
		}
	}

	public static boolean check() {
		Queue<int[]> q = new LinkedList<>();
		boolean[][] copy = new boolean[5][5];
		for (int i = 0; i < 5; i++) {
			copy[i] = checked[i].clone();
		}
		int x =0; int y=0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (copy[i][j]) {
					x=i;
					y=j;
					break;
				}
			}
		}
		q.add(new int [] {x,y});
		int cnt =0; 
		int s=0;
		while(!q.isEmpty()) {
			int [] now = q.poll();
			int r = now[0];
			int c = now[1];
			for(int k=0; k<4; k++) {
				int nr = r+dr[k];
				int nc = c+dc[k];
				if(nr>=0 && nr<5 && nc>=0 &&nc<5 && copy[nr][nc]) {
					if(map[nr][nc].equals("S")) s++;
					cnt++;
					q.add(new int [] {nr,nc});
					copy[nr][nc] = false;
				}
			}
		}
		if(cnt==7 && s>=4) {
			return true;
		}

		return false;
	}
}
