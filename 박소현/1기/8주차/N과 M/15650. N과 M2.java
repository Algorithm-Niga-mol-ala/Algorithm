import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15650_N과M2 {
	static int[] arr, choose;
	static boolean[] visited;
	static int n, m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[n];
		choose = new int[m];
		visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		comb(0, 0);

	} // main

	static void comb(int idx, int cidx) {
		if (cidx == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(choose[i] + " ");
			}
			System.out.println();
			return;
		}
		if (idx == n)
			return;

		choose[cidx] = arr[idx];
		comb(idx + 1, cidx + 1);
		comb(idx + 1, cidx);

	}

}
