import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15652_N과M4 {
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

		dupComb(0, 0);
		System.out.println(sb);
		br.close();

	} // main

	static void dupComb(int idx, int cidx) {
		if (cidx == m) {
			for (int i = 0; i < m; i++) {
				sb.append(choose[i] + " ");
			}
			sb.append("\n");
			return;
		}
		if (idx == n)
			return;

		choose[cidx] = arr[idx];
		dupComb(idx, cidx + 1); // 중복해서 만들 수 있으므로 해당 idx도 들어올 수 있음!!!!!!!!!!!
		dupComb(idx+1, cidx);

	} // dupComb
}
