import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main15657_N과M8 {
	static int[] arr, choose;
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

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		comb(0, 0);
		System.out.println(sb);
		br.close();
	} // main

	static void comb(int idx, int cidx) {
		if (cidx == m) {
			for (int i = 0; i < m; i++) {
				sb.append(choose[i] + " ");
			}
			sb.append("\n");
			return;
		}
		if(idx==n) return;

		choose[cidx] = arr[idx];
		comb(idx, cidx + 1);
		comb(idx+1, cidx);

	}
}
