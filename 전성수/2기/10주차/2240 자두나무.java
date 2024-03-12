
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		String[] TW = br.readLine().split(" ", 0);

		int T = Integer.parseInt(TW[0]); // 1~1000
		int W = Integer.parseInt(TW[1]); // 1~30
		int[] jadu = new int[T + 1];
		for (int i = 1; i <= T; i++) {
			int now = Integer.parseInt(br.readLine());
			jadu[i] = now;
		}

		int[][] dp = new int[T + 1][W + 1];
		int answer = 0;
		for (int i = 1; i <= T; i++) {
			if (jadu[i] == 1) {
				dp[i][0] = dp[i - 1][0] + 1;
			} else {
				dp[i][0] = dp[i - 1][0];
			}
			for (int w = 1; w <= W; w++) {
				if(w%2==0) {//1일때
					if (jadu[i] == 1) {
						dp[i][w] = Math.max(dp[i - 1][w] + 1,dp[i-1][w-1]);
					} else {
						dp[i][w] = Math.max(dp[i - 1][w-1] + 1,dp[i-1][w]);
					}
				}else {//2일때
					if (jadu[i] == 2) {
						dp[i][w] = Math.max(dp[i - 1][w] + 1,dp[i-1][w-1]);
					} else {
						dp[i][w] = Math.max(dp[i - 1][w-1] + 1,dp[i-1][w]);
					}
				}
				
				answer = Math.max(answer, dp[i][w]);
			}
		}

		System.out.println(answer);

	}

}
