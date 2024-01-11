import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int N;
	static boolean[] checked;
	static int[][] map;
	static int ans;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];

		for (int i = 0; i < N; i++) {// N = 20 , 100
			String[] row = br.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(row[j]);
			}
		}

		checked = new boolean[N];
		ans = Integer.MAX_VALUE;
		dfs(0, 0);
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static void dfs(int depth, int cnt) {
		if (cnt == N / 2) {
			synergy();

			return;
		}

		for (int i = depth; i < N; i++) {
			if (!checked[i]) {
				checked[i] = true;
				dfs(i + 1, cnt + 1);
				checked[i] = false;
			}
		}

	}

	private static void synergy() {

		int link_sum = 0;

		int start_sum = 0;

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (checked[i] && checked[j]) {
					link_sum += map[i][j];
					link_sum += map[j][i];
				} else if (!checked[i] && !checked[j]) {
					start_sum += map[i][j];
					start_sum += map[j][i];
				}
			}
		}
		int tmp = Math.abs(link_sum - start_sum);
		if (tmp == 0) {
			System.out.println(tmp);
			System.exit(0);
		}
		ans = Math.min(ans, tmp);
	}

}
