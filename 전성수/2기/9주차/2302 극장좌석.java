import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int cnt = 1;
		
		int[] dp = new int[41];
		dp[0] =1;
		dp[1] = 1;
		dp[2] = 2;
		for(int i=3; i<41; i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		
		
		int before =0;
		for(int i=0; i<M; i++) {
			int now = Integer.parseInt(br.readLine());
			cnt *=dp[now-before-1]; 
			before = now;
		}
		cnt*=dp[N-before];
		System.out.println(cnt);
	}
}
