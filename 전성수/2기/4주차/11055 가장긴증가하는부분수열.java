import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];

		String[] str_arr = br.readLine().split(" ", 0);
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(str_arr[i]);
		}
		int[] dp = new int[N];
		dp[0] = arr[0];
		int max = dp[0];
		for (int i = 1; i < N; i++) {
			dp[i] = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] > arr[j]) {
					dp[i] = Math.max(dp[i],dp[j] + arr[i]);
				}
			}
			max = Math.max(max, dp[i]);
		}

		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
