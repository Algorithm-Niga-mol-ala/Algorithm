import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main15654_N과M5 {
	static int[] arr, choose;
	static boolean[] visited;
	static int n, m;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		sb = new StringBuilder();

		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[n];
		choose = new int[m];
		visited = new boolean[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 미리 정렬하고 들어가면 사전순으로 출력할 수 있음!
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));

		perm(0);
		System.out.println(sb);
		br.close();

	} // main

	static void perm(int idx) {
		if (idx == m) {
			for (int i = 0; i < m; i++) {
				sb.append(choose[i] + " ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < n; i++) {
			if (visited[i]) continue;
			choose[idx] = arr[i];
			visited[i] = true;
			perm(idx + 1);
			visited[i] = false;
		}
	}
}
