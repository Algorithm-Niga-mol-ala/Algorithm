
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static StringBuilder sb;
	static int N,M;
	static boolean[] visited;
	static int[] ans;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		
		String [] NM = br.readLine().split(" ");
		
		N = Integer.parseInt(NM[0]);	//1부터 N까지의 자연수
		M= Integer.parseInt(NM[1]); 	//M개 선택한 수열
		visited = new boolean[N+1];
		ans = new int[M];
		dfs(0,1);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static void dfs(int depth, int st) {
		if(depth==M) {
			for(int i=0; i<M; i++) {
				
				sb.append(ans[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=st; i<N+1; i++) {
			
			
			ans[depth]=i;
			
			
			dfs(depth+1, i);
			
		
			
		}
	}

}
