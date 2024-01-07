import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15651_N과M3 {
	static int[] arr, choose;
	static int n, m;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[n];
		choose = new int[m];

		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		dupPerm(0);

    // sysout은 시간초과가 떠버림 -> sb 사용함
		System.out.println(sb);
		br.close();
	} // main

	static void dupPerm(int idx) {
		if (idx == m) {
			for (int i = 0; i < m; i++) {
				sb.append(choose[i] + " ");
			}
			sb.append("\n");
			return;
		}

		// 중복해서 뽑아도 되므로 방문처리를 해줄 필요가 없음!!!!!!!!
		for (int i = 0; i < n; i++) {
			choose[idx] = arr[i];
			dupPerm(idx + 1);
		}
	} // dupPerm
}
