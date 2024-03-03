
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
	
		int n = Integer.parseInt(br.readLine());//1 ≤ n ≤ 1,000
		
		int [] dp = new int [n+1];
		
		dp[1] = 1;
		dp[2] = 3;
		if(n==1 || n==2) {
			System.out.println(dp[n]);
			System.exit(0);
		}
		
		
		for(int i=3; i<=n; i++) {
			dp[i] = (dp[i-1]+2*dp[i-2])%10007;
		}
		
		System.out.println(dp[n]);
	}
}
