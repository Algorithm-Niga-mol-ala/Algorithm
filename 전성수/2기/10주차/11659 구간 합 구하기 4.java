import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
	
		
		String [] NM = br.readLine().split(" ",0);
		
		int N = Integer.parseInt(NM[0]);//1~100_000
		int M = Integer.parseInt(NM[1]);//1~100_000
		
		String [] nums = br.readLine().split(" ",0);
		int [] num = new int[N+1];
		for(int i=1; i<=N; i++) {
			int now = Integer.parseInt(nums[i-1]);
			num[i] = now;
		}
		
		int [] sum = new int [N+1];
		
		for(int i=1; i<=N; i++) {
			sum[i] = num[i]+sum[i-1];
		}
		
		for(int k=0; k<M; k++) {
			String [] ij = br.readLine().split(" ",0);
			int i= Integer.parseInt(ij[0]);
			int j= Integer.parseInt(ij[1]);
			int ans = sum[j]-sum[i-1];
			sb.append(ans).append("\n");
		}
		System.out.println(sb.toString());
	}

	
}
