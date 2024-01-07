
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	static StringBuilder sb;
	static int N,M;
	static boolean[] visited;
	static int[] ans, nums;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		
		String [] NM = br.readLine().split(" ");
		
		N = Integer.parseInt(NM[0]);	//1부터 N까지의 자연수
		M= Integer.parseInt(NM[1]); 	//M개 선택한 수열
		visited = new boolean[N+1];
		ans = new int[M];
		String [] Ns = br.readLine().split(" ");
		nums = new int [N];
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(Ns[i]);
		}
		Arrays.sort(nums);
		
		dfs(0);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static void dfs(int depth) {
		if(depth==M) {
			for(int i=0; i<M; i++) {
				
				sb.append(ans[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=0; i<N; i++) {
			
			if(visited[i]) continue;
			//중복을 거르기 위해서 방문 확인
			
			visited[i]=true;
			ans[depth]=nums[i];
		
			dfs(depth+1);
			
			visited[i]=false;
		
			
		}
	}

}
