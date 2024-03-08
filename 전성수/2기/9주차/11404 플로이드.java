import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		int[][] map = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = 987654321;
				if (i == j) {
					map[i][i] = 0;
				}
			}
		}
		
		
		
		for (int i = 0; i < m; i++) {
			String[] row = br.readLine().split(" ", 0);
			int st = Integer.parseInt(row[0]);
			int ed = Integer.parseInt(row[1]);
			int cost = Integer.parseInt(row[2]);
			if (map[st - 1][ed - 1] > cost) {
				map[st - 1][ed - 1] = cost;
			}

		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (map[i][j] > map[i][k] + map[k][j]) {
						map[i][j] = map[i][k] + map[k][j];
					}
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(map[i][j] == 987654321) {
				 map[i][j] =0;
				}
				
				sb.append(map[i][j] + " ");
				
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());

	}
}
